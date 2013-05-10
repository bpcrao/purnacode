/**
 * 
 */
package org.code.sortings;

import java.util.Arrays;

/**
 * @author Purna
 * 
 */
public class MergeSort {

	public static void main(String[] args) {
		int[] numbers = { 50, 40, 70, 91, 33, 1, 99, 7, 45 };
		sort(numbers, 0, numbers.length - 1);

		System.out.println(Arrays.toString(numbers));
	}

	/**
	 * @param numbers
	 * @param low
	 * @param high
	 */
	private static void sort(int[] numbers, int low, int high) {
		System.out.printf("Sort low %d high %d \n", low, high);
		if (low >= high) {
			return;
		}
		int mid = (low + high) / 2;
		sort(numbers, low, mid);
		sort(numbers, mid + 1, high);
		merge(numbers, low, mid, mid + 1, high);
	}

	/**
	 * @param numbers
	 * @param low
	 * @param mid
	 * @param midHigh
	 * @param high
	 */
	private static void merge(int[] numbers, int low, int mid, int midHigh,
			int high) {
		int[] auxNumbers = numbers.clone();

		int i = low;
		int k = midHigh;
		for (int j = low; j <= high; j++) {

			if (i > mid) {
				numbers[j] = auxNumbers[k++];
			}

			else if (k > high) {
				numbers[j] = auxNumbers[i++];
			}

			else if (auxNumbers[i] < auxNumbers[k]) {
				numbers[j] = auxNumbers[i++];
			} else if (auxNumbers[i] >= auxNumbers[k]) {
				numbers[j] = auxNumbers[k++];
			}
		}

	}
}
