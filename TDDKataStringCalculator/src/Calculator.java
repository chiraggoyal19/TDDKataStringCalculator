
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
		for(String current:number) {
			if(Integer.parseInt(current)<0) {
				throw new Exception("String contains Negative Input"+current);
			}
		}
		int sum=0;
		for(String current:number) {
			sum+=Integer.parseInt(current);
		}
		return sum;
	}

}
