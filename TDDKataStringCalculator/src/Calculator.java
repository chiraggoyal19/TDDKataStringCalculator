import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Calculator {
	
	public int calculate(String input) throws Exception {
		
		if(input.isEmpty()) {
			return 0;
		}
		
		String numbers[]=null;
		
		if(input.startsWith("//")) {
			String delimiterandnumber[]=input.split("\n", 2);
			String delimiter=finddelimiter(delimiterandnumber[0]);
			String numbers1[]=delimiterandnumber[1].split(delimiter);
			numbers=numbers1.clone();
		}
		
		else {
			String numbers1[]=input.split(",|\n");
			numbers=numbers1.clone();
		}
		
		
		if(numbers.length==1 && input.length()==1) {
			return Integer.parseInt(input);
		}
		
		else {
			return CalculateSum(numbers);
		}
	}
	
	private static String finddelimiter(String header) {
		String delimiter=header.substring(2);
		if(delimiter.startsWith("[")) {
			delimiter=delimiter.substring(1,delimiter.length()-1);
		}
		return Stream.of(delimiter.split("]\\["))
				.map(Pattern::quote)
				.collect(Collectors.joining("|"));
	}
	
	
	private int CalculateSum(String number[]) throws Exception {
		CheckforNegatives(number);
		return IgnoreInputGreaterthan1000andFindSum(number);
	}
	
	
	private int IgnoreInputGreaterthan1000andFindSum(String []number) {
		int sum=0;
		for(String current:number) {
			if(Integer.parseInt(current)>1000) {
				continue;
			}
			sum+=Integer.parseInt(current);
		}
		return sum;
	}
	
	private void CheckforNegatives(String number[]) throws Exception {
		String negativeinputs="";
		for(String current:number) {
			if(Integer.parseInt(current)<0) {
				negativeinputs+=current+",";
				if(number.length==1) {
					throw new Exception("String contains Negative Input"+current);
				}
				else {
					throw new Exception("String contains Negative Input"+negativeinputs);
				}
			}
		}
	}

}
