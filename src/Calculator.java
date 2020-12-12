
public class Calculator {
	
	public int calculate(String input) {
		String[] numbers = input.split(",");

		if(isEmpty(input)) {
			return 0;
		}
		if(input.length() == 1) {
			return stringToInt(input);
		}else {
			return getSum(numbers[0],numbers[1]);
		}	
	}
	
	private int getSum(String numA, String numB) {
		return Integer.parseInt(numA) + Integer.parseInt(numB);
	}
	
	private boolean isEmpty(String input) {
		return input.isEmpty();
	}
	
	private int stringToInt(String input) {
		return Integer.parseInt(input);
	}
}