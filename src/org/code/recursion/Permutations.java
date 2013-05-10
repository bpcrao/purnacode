/**
 * 
 */
package org.code.recursion;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Purna
 * 
 */
public class Permutations {

	public static void main(String[] args) {
		System.out.println(Permutations.permute("abc"));
	}

	/**
	 * @param string
	 */
	public static List<String> permute(String word) {

		return permutes(word);
	}

	/**
	 * @param prefix
	 * @param word
	 * @param permutations
	 */
	public static List<String> permutes(String word) {

		List<String> theList = new ArrayList<String>();
		if (word.length() == 1) {
			theList.add(word);
			return theList;
		} else {
			List<String> lis= permutes(word.substring(1));
			for (Iterator iterator = lis.iterator(); iterator.hasNext();) {
				String string = (String) iterator.next();
				theList.addAll(insertAtAll(word.charAt(0) + "", string));	
			}
			
		}
		return theList;

	}

	/**
	 * @param str
	 * @return
	 */
	private static List<String> insertAtAll(String prefix, String str) {
		List<String> theList = new ArrayList<String>();
		for (int index = 0; index <= str.length(); index++) {
			theList.add(str.substring(0, index) + prefix + str.substring(index));
		}
		return theList;
	}

}
