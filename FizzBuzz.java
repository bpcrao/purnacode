/**
 * 
 */

/**
 * @author purna
 * 
 */
public class FizzBuzz {

	public static void main(String args[]) {
		for (int number = 1; number <= 30; number++) {
			printFizzBuzz(number);
		}
	}

	/**
	 * @param number
	 */
	private static void printFizzBuzz(int number) {
		StringBuilder result = new StringBuilder();

		if (number % 3 == 0) {
			result.append("fizz ");
		}
		if (number % 5 == 0) {
			result.append("buzz");
		}
		if (result.toString().isEmpty()) {
			result.append(number);
		}
		System.out.println(result);
	}
}
