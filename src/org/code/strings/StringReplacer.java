/**
 * 
 */
package org.code.strings;

/**
 * @author Purna
 * 
 */
public class StringReplacer {

	public static void main(String ar[]) {
		replaceSpaces("Hello WO rl d", "%20");
	}

	/**
	 * @param input
	 * @param replaceChars
	 */
	private static void replaceSpaces(String input, String replaceChars) {
		int spacesCount = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == ' ') {
				spacesCount++;
			}
		}
		System.out.println(spacesCount);
		char newString[] = new char[input.length() + 2 * spacesCount];

		for (int i = input.length() - 1, j = newString.length - 1; i >= 0; i--, j--) {
			if (input.charAt(i) == ' ') {
				newString[j] = '0';
				newString[j - 1] = '2';
				newString[j - 2] = '%';
				j = j - 2;

			} else {
				newString[j] = input.charAt(i);
			}
			System.out.println(newString);
		}

	}

}
