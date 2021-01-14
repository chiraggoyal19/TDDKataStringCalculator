import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
@Test
public class TestCalculate {
	
	private Calculator calculator;
	
	@BeforeTest	
	public void init() {
		calculator=new Calculator();
	}
	//Test-1 Empty String must return Zero
	public void EmptyStringReturnZero(){
		assertEquals(calculator.calculate(""),0);
	}
	
	// Test-2 String with Single Number Must return that Number
	public void StringWithSingleNumber() {
		assertEquals(calculator.calculate("1"),1);
		assertEquals(calculator.calculate("2"),2);
	}
	
	//Test-3 String with two numbers and comma delimiter returns the sum
	public void ReturnSumofTwoNumberWithCommaDelimiter() {
		assertEquals(calculator.calculate("1,2"),3);
	}
}
