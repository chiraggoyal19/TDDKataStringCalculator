
public class Calculator {
	private final String delimiter=",|\n";
	public int calculate(String input) throws Exception {
		String numbers[]=input.split(delimiter);
		if(input.isEmpty()) {
			return 0;
		}
		if(numbers.length==1 && input.length()==1) {
			return Integer.parseInt(input);
		}
		else {
			return CalculateSum(numbers);
		}
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
