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
	
	public void emptyStringReturnsZero() {
		assertEquals(calculator.calculate(""),0);
	}
	
	public void singleValueIsReplied() {
		assertEquals(calculator.calculate("1"),1);
	}

	public void Sum() throws Exception {
		assertEquals(calculator.calculate("1,2"), 3);
	}
	
	public void DelimitedRuns() throws Exception {
		assertEquals(calculator.calculate("1\n2"), 3);
	}
}