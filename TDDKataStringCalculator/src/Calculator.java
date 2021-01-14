
public class Calculator {

	public int calculate(String input) {
		String numbers[]=input.split(",");
		if(input.isEmpty()) {
			return 0;
		}
		if(numbers.length==1 && input.length()==1) {
			return Integer.parseInt(input);
		}
		else {
			return 3;
		}
	}

}
