/**
 * 
 */
package org.code.sortings;

/**
 * @author Purna
 * 
 */
public class SelectionSort {

	/**
	 * find the minimum in the series and swap it to the index
	 * 
	 * @param numbers
	 */
	private static void sortList(Integer[] numbers) {
		for (int index = 0; index < numbers.length; index++) {
			int minIndex = findMininRest(index, numbers);
			if (minIndex != index) {
				swap(minIndex, index, numbers);
				printArray(numbers);
			}
		}
	}

	/**
	 * @param numbers
	 */
	private static void printArray(Integer[] numbers) {
		for (Integer integer : numbers) {
		System.out.print(integer+" ");	
		}
		System.out.println();
	}

	/**
	 * swap 2 numbers at the index
	 * 
	 * @param minIndex
	 * @param index
	 * @param numbers
	 */
	private static void swap(int minIndex, int index, Integer[] numbers) {
		Integer temp = numbers[minIndex];
		numbers[minIndex] = numbers[index];
		numbers[index] = temp;
	}

	/**
	 * find the minimum in the rest of the series
	 * 
	 * @param index
	 *            the current index to fill
	 * @param numbers
	 *            all the numbers
	 * @return returns the index of the minimum element in the rest series from
	 *         index
	 */
	private static int findMininRest(int index, Integer[] numbers) {
		int currentMin = index;
		for (int restIndex = index + 1; restIndex < numbers.length; restIndex++) {
			if (numbers[currentMin] > numbers[restIndex]) {
				currentMin = restIndex;
			}
		}
		return currentMin;
	}
	
	
	public static void main(String[] args) {
		Integer[] numbers={21,31,45,22,67,88,90,12,33};
		sortList(numbers);
	}
}
