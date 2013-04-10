/**
 * 
 */
package org.code;

/**
 * @author Purna
 * 
 */
public class FizzBuzzHR {

	/**
	 * 
	 */
	public FizzBuzzHR() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		for (int i = 0; i < 100; i++) {

			System.out.println(i % 3 == 0 ? "Fizz" + (i % 5 == 0 ? "Buzz" : "")
					: i % 5 == 0 ? "Buzz" : i + "");
		}
	}

}
