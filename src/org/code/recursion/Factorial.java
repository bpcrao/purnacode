/**
 * 
 */
package org.code.recursion;

/**
 * @author Purna
 *
 */
public class Factorial {

	/**
	 * 
	 */
	public Factorial() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		System.out.println(findFactorialOf(7));
	}

	/**
	 * @param i
	 */
	private static int findFactorialOf(int i) {

		if(i==0 || i==1)
			return 1;
		
		return i*findFactorialOf(i-1);
	}

}
