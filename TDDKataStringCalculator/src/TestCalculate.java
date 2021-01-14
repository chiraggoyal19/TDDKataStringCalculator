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
	public void EmptyStringReturnZero() throws Exception{
		assertEquals(calculator.calculate(""),0);
	}
	
	// Test-2 String with Single Number Must return that Number
	public void StringWithSingleNumber() throws Exception {
		assertEquals(calculator.calculate("1"),1);
		assertEquals(calculator.calculate("2"),2);
	}
	
	//Test-3 String with two numbers and comma delimiter returns the sum
	public void ReturnSumofTwoNumberWithCommaDelimiter() throws Exception {
		assertEquals(calculator.calculate("1,2"),3);
	}
	
	
	//Test-4 String with two numbers and NewLine delimiter returns the sum
	public void ReturnSumofTwoNumberWithNewLineDelimiter() throws Exception {
		assertEquals(calculator.calculate("1\n2"),3);
		assertEquals(calculator.calculate("2\n2"),4);
		}
		
	//Test-5 String with three numbers and Comma and  NewLine delimiter returns the sum
	public void ReturnSumofThreeNumberWithCommaAndNewLineDelimiter() throws Exception {
		assertEquals(calculator.calculate("1,2,3"),6);
		assertEquals(calculator.calculate("1\n2\n3"),6);
		
	}	
	
	//Test6- String With Negative Number Throws Exception
	@Test(expectedExceptions=Exception.class)
	public void StringWithnegativeNumberReturnsException() throws Exception {
		calculator.calculate("-1");
		calculator.calculate("-1,3,-4,-6,7,-8");

	}
	
}
