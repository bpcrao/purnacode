package org.code;
/**
 * 
 */

/**
 * @author Purna
 * 
 */
public class DuplicateCharRemover {

	public static void main(String args[]) {
		char[] strWithDup = { 'h','h', 'e', 'l', 'l', 'o','e','s','s' };
		removeDuplicates(strWithDup);
		System.out.println(strWithDup);
	}

	/**
	 * Without using extra(large) memory Complexity O(n^2)
	 * 
	 * @param strWithDup
	 */
	/**
	 * @param word
	 */
	private static void removeDuplicates(char[] word) {
		int currentIndex = 1;
		for (int i = 0; i < word.length; i++) {
			int j;
			for (j = 0; j < currentIndex; j++) {
				if (word[i] == word[j]) {
					break;
				}
			}
			if (currentIndex == j) {
				word[currentIndex++] = word[i];
			}

		}
		while (currentIndex < word.length) {
			word[currentIndex++] = ' ';
		}
	}

}
