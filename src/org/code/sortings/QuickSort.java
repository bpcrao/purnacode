/**
 * 
 */
package org.code.sortings;

import java.util.Arrays;

/**
 * @author Purna
 * 
 */
public class QuickSort {

	/**
	 * 
	 */
	public QuickSort() {

	}

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
		if (low >= high) {
			return;
		}

		int partition = partition(numbers, low, high);
		sort(numbers, low, partition);
		sort(numbers, partition + 1, high);
	}

	/**
	 * @param numbers
	 * @param low
	 * @param high
	 * @return
	 */
	private static int partition(int[] numbers, int low, int high) {		
		int j = low ;
		int k = high;

		while (true) {
			System.out.println(j);
			
			System.out.println(Arrays.toString(numbers));
			while (numbers[j] < numbers[low]) {
				j++;
				if (j == high) {
					break;
				}
			}
			while (numbers[k] > numbers[low]) {
				k--;
				if (k == low) {
					break;
				}
			}

			if (k <= j) {
				break;
			}

			swap(numbers, j, k);
		}
		swap(numbers, low, k);
		return k;
	}

	/**
	 * @param numbers
	 * @param j
	 * @param k
	 */
	private static void swap(int[] numbers, int j, int k) {
		int temp = numbers[j];
		numbers[j] = numbers[k];
		numbers[k] = temp;

	}

}
