/**
 * 
 */
package org.code.recursion;


/**
 * @author Purna
 * 
 */
public class Combinations {

	public static void main(String[] args) {

		Combinations.getCombinations("", "abc");
	}

	/**
	 * @param data
	 */
	private static void getCombinations(String prefix, String data) {
		if (data.length() > 0) {
			System.out.println(prefix + "==="+data.charAt(0));			
			getCombinations(prefix + data.charAt(0), data.substring(1));			
			getCombinations(prefix, data.substring(1));
		}
	}
}
