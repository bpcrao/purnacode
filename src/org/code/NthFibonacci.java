/**
 * 
 */
package org.code;

/**
 * @author Purna
 * 
 */
public class NthFibonacci {

	/**
	 * Fib series 0 1 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			System.out.print(fibo(i) +" ");
		}
				
		
		 
	}

	/**
	 * @param i
	 * @return
	 */
	private static int fibo(int i) {
		if(i==0 ){
			return 0;
		}else if(i==1 ){
			return 1;
		}
		
		return fibo(i-1)+fibo(i-2);
	}

}
