
public class Calculator {

	public int calculate(String input) {
		if(input.isEmpty()) {
			return 0;
		}
		return Integer.parseInt(input);
	}

}
