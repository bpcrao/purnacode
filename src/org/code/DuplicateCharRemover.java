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
		char[] strWithDup = { 'h', 'h', 'e', 'l', 'l', 'o', 'e', 's', 's' };
		removeDuplicates(strWithDup);
		System.out.println(strWithDup);
	}

	/**
	 * Without using extra(large) memory Complexity O(n^2)
	 * 
	 * a a index current index
	 * 
	 * @param strWithDup
	 */
	/**
	 * @param word
	 */
	private static void removeDuplicates(char[] word) {
		int currentIndex = 0;
		for (int index = 0; index < word.length; index++) {
			int j = 0;
			for (; j < index; j++) {
				if (word[j] == word[index] && j != index) {
					break;
				} 
			}
			if(j==index){
				word[currentIndex++]=word[index];
			}
			
		}
		for(;currentIndex<word.length;currentIndex++){
			word[currentIndex]= ' ';
		}
	}

	/**
	 * @param word
	 * @param currentIndex
	 * @param index
	 * @return
	 */
	private static int checkExist(int index, int currentIndex, char[] word) {
		int subIndex = index;
		for (; subIndex <= currentIndex; subIndex++) {
			if (word[subIndex] == word[index])
				return subIndex;
		}
		return subIndex;
	}

}
