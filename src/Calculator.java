
public class Calculator {
	
	public int calculate(String input) throws Exception {
		String[] numbers = input.split(",|\n");

		if(isEmpty(input)) {
			return 0;
		}
		if(input.length() == 1) {
			return stringToInt(input);
		}else {
			return getSum(numbers);
		}	
	}
	
	private int getSum(String[] numbers) throws Exception {
		NegativeException(numbers);
		int sum = 0;
		for(String value: numbers) {
			sum += Integer.parseInt(value);	
		}
		return sum;
	}
	
	private void NegativeException(String[] numbers) throws Exception{
		for(String value:numbers) {
			if(stringToInt(value) < 0) {
				throw new Exception("The Value Passed Is Negative");
			}
		}
	}
	
	private boolean isEmpty(String input) {
		return input.isEmpty();
	}
	
	private int stringToInt(String input) {
		return Integer.parseInt(input);
	}
}