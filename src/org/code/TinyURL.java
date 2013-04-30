package org.code;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Purna
 * 
 */
public class TinyURL {

	private static int uniqueId = 1925;
	private static int radix = 62;
	private static Map<String, String> urlsMap = new HashMap<String, String>();
	static String[] elements = { "a", "b", "c", "d", "e", "f", "g", "h", "i",
			"j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v",
			"w", "x", "y", "z", "1", "2", "3", "4", "5", "6", "7", "8", "9",
			"0", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L",
			"M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y",
			"Z" };
	static public Map<String, Integer> map = new HashMap<String, Integer>();

	public static void main(String arp[]) {
		String shortenedUrl = shortenURL("http://www.stumbleupon.com/su/28KqXE/www.funnyordie.com/slideshows/ff413570ec/awesomely-inappropriate-test-answers-from-kids/");
		System.out.println("To redirect to original URL");
		System.out.println(urlsMap.get(shortenedUrl));
		for (int index = 0; index < elements.length; index++) {
			map.put(elements[index], new Integer(index));
		}
		decodeURL(shortenedUrl);
	}

	/**
	 * @param string
	 */
	private static void decodeURL(String string) {
		int sum = 0;
		for (int i = 0; i < string.length(); i++) {
			sum += map.get(string.charAt(i) + "") * Math.pow(62, i);
		}
		System.out.println(sum);
	}

	/**
	 * shortens a url
	 * 
	 * Integer.toString
	 * 
	 * @param url
	 * 
	 * @return
	 */
	private static String shortenURL(String url) {
		int numberToEnode = uniqueId;
		StringBuilder code = new StringBuilder();
		while (numberToEnode > 0) {
			code.append(elements[numberToEnode % radix]);
			numberToEnode = numberToEnode / radix;
		}
		urlsMap.put(code.toString(), url);
		return code.toString();
	}
}
