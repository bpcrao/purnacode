package org.code.reincarnate;

import java.util.HashMap;
import java.util.Map;

public class ShortestSubString {

	public static int shortestSubstring(String s) {
		char[] charInString = s.toCharArray();

		HashMap<Object, Integer> uniqueChars = new HashMap<Object, Integer>();

		for (int i = 0; i < charInString.length; i++) {
				uniqueChars.put(charInString[i] + "", 1);
		}

		int minSubstringSize = s.length();

		for (int i = 0; i < charInString.length; i++) {
			Map<Integer, Boolean> hasOccurred = new HashMap<Integer, Boolean>();
			for (int j = i; j < charInString.length; j++) {
				hasOccurred.put(Integer.valueOf(charInString[j]), true);
				if (uniqueChars.size() == hasOccurred.size() && minSubstringSize > (j - i)) {
					minSubstringSize = j - i + 1;
				}
			}
		}
		return minSubstringSize;
	}
}
