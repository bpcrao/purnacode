/**
 * 
 */
package org.code.sortings;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * @author Purna
 * 
 */
public class MerrgeSorrt {

	/**
	 * 
	 */
	public MerrgeSorrt() {
	}

	public static void main(String[] args) throws UnsupportedEncodingException {
//		int[] numbers = { 50, 40, 70, 91, 33, 1, 99, 7, 45 };
//		sort(numbers, 0, numbers.length - 1);
//
//		System.out.println(Arrays.toString(numbers));
		
		String appple = new String("&#174;".getBytes(),"ISO-8859-1");
		
		System.out.println(new String(appple.getBytes(),"UTF-8"));
		System.out.println(new String(appple.getBytes(),"ISO-8859-1"));
		
		
	}

	/**
	 * @param numbers
	 * @param low
	 * @param high
	 */
	private static void sort(int[] numbers, int low, int high) {
		System.out.println("Sorting " + low + " to " + high);
		if (low >= high) {
			return;
		}
		// 0 and 5 0---2 and 3--5
		int mid = (low + high) / 2;
		int midPlus = mid + 1;
		sort(numbers, low, mid);
		sort(numbers, midPlus, high);
		merge(numbers, low, mid, midPlus, high);
	}

	/**
	 * @param numbers
	 * @param low
	 * @param mid
	 * @param midPlus
	 * @param high
	 */
	private static void merge(int[] numbers, int low, int mid, int midPlus,
			int high) {
		int[] aux = numbers.clone();

		int lowIndex = low;
		int highIndex = midPlus;

		for (int index = low; index <= high; index++) {
			if (highIndex > high) {
				numbers[index] = aux[lowIndex++];
				continue;
			} else if (lowIndex > mid) {
				numbers[index] = aux[highIndex++];
				continue;
			}
			if (aux[lowIndex] <= aux[highIndex]) {
				numbers[index] = aux[lowIndex++];
			} else if (aux[lowIndex] > aux[highIndex]) {
				numbers[index] = aux[highIndex++];
			}

		}

	}
}
