/**
 * 
 */
package org.code;

import java.util.HashMap;

/**
 * @author Purna
 * 
 */
public class NoStackOverflow {
	private static void doSomething() {
		String a = new String("this will thw");
		HashMap as = new HashMap<>();
	 	try {
			
			doSomething();
			return;
		}  finally {
			doSomething();
			System.out.println("finally");

		}
	}

	public static void main(String[] args) {
		doSomething();
	}
}