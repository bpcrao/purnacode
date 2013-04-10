package org.code;
/**
 * Class which 
 * 
 * prints fizz if number divisible by 3
 * buzz of divisible by 5
 * fizz buzz if divisible by 15
 * else prints the number
 * 
 */

/**
 * @author purna
 * 
 */
public class FizzBuzz {

	public static void main(String args[]) {
		for (int number = 1; number <= 100; number++) {
			printFizzBuzz(number);
		}
	}

	/**
	 * prints
	 * 
	 * <pre>
	 *  fizz if number divisible by 3 
	 *  buzz of divisible by 5 
	 *  fizz buzz if divisible by 15 
	 *  else prints the number
	 * </pre>
	 * 
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
