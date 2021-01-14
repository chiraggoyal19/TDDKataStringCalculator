
public class Calculator {

	public int calculate(String input) {
		String numbers[]=input.split(",|\n");
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
	
	private int CalculateSum(String number[]) {
		int sum=0;
		for(String current:number) {
			sum+=Integer.parseInt(current);
		}
		return sum;
	}

}
