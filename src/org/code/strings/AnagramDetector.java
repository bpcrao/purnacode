/**
 * 
 */
package org.code.strings;

/**
 * @author Purna
 * 
 */
public class AnagramDetector {

	/**
	 * @param firstWord
	 * @param secondWord
	 */
	public static boolean areAnagram(String firstWord, String secondWord) {

		int numberOfUnique = 0;
		int processed = 0;
		if (firstWord.length() != secondWord.length()) {
			return false;
		}
		int[] chars = new int[256];
		for (int i = 0; i < firstWord.length(); i++) {
			if (chars[firstWord.charAt(i)] == 0) {
				numberOfUnique++;
			}
			chars[firstWord.charAt(i)]++;
		}
		for (int i = 0; i < secondWord.length(); i++) {
			// this char is not there so false
			if (chars[secondWord.charAt(i)] == 0)
				return false;

			chars[secondWord.charAt(i)]--;

			if (chars[secondWord.charAt(i)] == 0) {
				processed++;
				if (numberOfUnique == processed) {
					System.out.println(processed);
					return secondWord.length() == processed + 1;
				}
			}

		}

		return true;
	}

}
