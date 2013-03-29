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

		if (firstWord.length() != secondWord.length()) {
			return false;
		}
		int[] chars = new int[256];
		for (int i = 0; i < firstWord.length(); i++) {
			chars[firstWord.charAt(i)] = 1;
		}
		for (int i = 0; i < secondWord.length(); i++) {
			if (chars[firstWord.charAt(i)] != 1)
				return false;
		}

		return true;
	}

}
