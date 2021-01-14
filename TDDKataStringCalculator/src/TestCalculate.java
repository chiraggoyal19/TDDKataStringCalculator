import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
@Test
public class TestCalculate {
	
	
	//Test-1 Empty String must return Zero
	public void EmptyStringReturnZero(){
		Calculator calculator=new Calculator();
		assertEquals(calculator.calculate(""),0);
		
	}
}
