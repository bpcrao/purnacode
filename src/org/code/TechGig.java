/**
 * 
 */
package org.code;

import java.util.Arrays;

/**
 * @author Purna
 * 
 */
public class TechGig {

	public static int median(int[] input1, int[] input2) {
		int[] out = mergeArrays(input1, input2);
		System.out.println(Arrays.toString(out));
		if (out.length % 2 == 0) {
			double result = (out[out.length - 1] + out[out.length - 2]) / 2d;
			if (result % 1 >= 0.5) {
				return (int) Math.ceil(result);
			} else {
				return (int) Math.floor(result);
			}
		} else {
			return out[out.length - 1];
		}
	}

	/**
	 * @param input1
	 * @param input2
	 * @return
	 */
	private static int[] mergeArrays(int[] input1, int[] input2) {
		int[] result = new int[input1.length + 1];

		int i = 0;
		int j = 0;
		for (int index = 0; index < result.length; index++) {
			if(input1.length==i){
				result[index] = input2[j++];
				continue;
			}
			if(input2.length==j){
				result[index] = input1[i++];
				continue;
			}
			
			if (input1[i] <= input2[j]) {
				result[index] = input1[i++];
			} else if (input1[i] > input2[j]) {
				result[index] = input2[j++];
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[] input1 = { 2, 7, 9, 12, 15, 17, 19, 23, 25, 27, 30 };
		int[] input2 = { 2, 5, 8, 10, 14 };

		System.out.println(median(input1, input2));
	}
}
