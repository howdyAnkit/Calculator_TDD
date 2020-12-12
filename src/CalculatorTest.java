import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

@Test
public class CalculatorTest {
	
	private Calculator calculator;
	
	@BeforeTest
	public void init() {
		calculator = new Calculator();
	}
	
	public void emptyStringReturnsZero() throws Exception {
		assertEquals(calculator.calculate(""),0);
	}
	
	public void singleValueIsReplied() throws Exception {
		assertEquals(calculator.calculate("1"),1);
	}

	public void Sum() throws Exception {
		assertEquals(calculator.calculate("1,2"), 3);
	}
	
	public void DelimitedTwoSum() throws Exception {
		assertEquals(calculator.calculate("1\n2"), 3);
	}
	
	public void DelimitedThreeSum() throws Exception{
		assertEquals(calculator.calculate("1,2,3"),6);
	}
	
	@Test(expectedExceptions=Exception.class)
	public void FixNegative() throws Exception{
		calculator.calculate("-1");
	}
	
	public void greaterThan1000() throws Exception{
		assertEquals(calculator.calculate("20,20,2000"), 20);
	}
}