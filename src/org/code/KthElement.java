/**
 * 
 */
package org.code;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author Purna
 * 
 */
public class KthElement {

	private static Random rd;

	public static void main(String[] args) {
		Object[] arr = { 9, 7, 3, 1, 2, 4, 6, 5 };
		rd = new Random();
		System.out.println(findKthElement(arr, 5));
	}

	/**
	 * @param objects
	 * @param i
	 */
	private static int findKthElement(Object[] objects, int kth) {
		System.out.println("findKte");
		int i = rd.nextInt(objects.length);
		ArrayList listOne = new ArrayList<>();
		ArrayList listTwo = new ArrayList<>();
		for (int j = 0; j < objects.length; j++) {
			if ((int) objects[j] < (int) objects[i]) {
				listOne.add(objects[j]);
			} else if ((int) objects[j] > (int) objects[i]) {
				listTwo.add(objects[j]);
			}
		}

		if (kth <= listOne.size()) {
			return findKthElement(listOne.toArray(), kth);
		} else if (kth > (objects.length - listTwo.size())) {
			return findKthElement(listTwo.toArray(), kth
					- (objects.length - listTwo.size()));
		} else {
			return (int) objects[i];
		}
	}

}
