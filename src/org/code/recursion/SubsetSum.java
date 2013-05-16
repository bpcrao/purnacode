/**
 * 
 */
package org.code.recursion;

import java.util.Set;

/**
 * @author Purna
 * 
 */
public class SubsetSum {

	/**
	 * 
	 */
	public static void main(String a[]) {
		int num[] = { 3, 34, 4, 12, 5, 2 };
		int sum = 9;
		int n = num.length;
		System.out.println(isSubSet(num, num.length - 1, sum));
	}

	/**
	 * @param num
	 * @param n
	 * @param sum
	 */
	private static boolean isSubSet(int[] num, int n, int sum) {
		if (sum == 0) {
			return true;
		}

		if (n == 0) {
			return false;
		}

		if (num[n] > sum)
			return isSubSet(num, n - 1, sum);

		return isSubSet(num, n - 1, sum - num[n]) || isSubSet(num, n - 1, sum);
	}

}
