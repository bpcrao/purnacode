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
			String p="";
			p=i % 3 == 0 ? "Fizz":"";
			p=i % 5 == 0 ? "Buzz":"";
			p=p.isEmpty()?i+"":p;
			System.out.println(p);
		}
	}

}
