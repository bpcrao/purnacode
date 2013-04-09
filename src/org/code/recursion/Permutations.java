/**
 * 
 */
package org.code.recursion;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Purna
 * 
 */
public class Permutations {

	public static void main(String[] args) {

	}

	/**
	 * @param string
	 */
	public static List<String> permute(String word) {
		List<String> permutations = new ArrayList<String>();
		permute(word, permutations);
		return permutations;
	}

	/**
	 * @param prefix
	 * @param word
	 * @param permutations
	 */
	public static List<String> permute(String word, List<String> permutations) {
		if (word.length() == 1) {
			permutations.add(word);
			return permutations;
		} else {
			String charOne = word.charAt(0) + "";
			List<String> list = permute(word.substring(1));
			for (String str : list) {
				ArrayList<String> tempList = insertAtAll(charOne, str);
				permutations.addAll(tempList);
			}
			return permutations;
		}

	}

	/**
	 * @param str
	 * @return
	 */
	private static ArrayList<String> insertAtAll(String prefix, String str) {
		ArrayList<String> theList = new ArrayList<String>();
		for (int index = 0; index <= str.length(); index++) {
			theList.add(str.subSequence(0, index) + prefix
					+ str.substring(index));
		}
		return theList;
	}
}
