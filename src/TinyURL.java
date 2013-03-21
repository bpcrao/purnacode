/**
 * @author Purna
 * 
 * 
 * 
 *         while (i <= -radix) { buf[charPos--] = digits[-(i % radix)]; i = i /
 *         radix; } buf[charPos] = digits[-i];
 * 
 *         taken from Integer.toString()
 */
public class TinyURL {

	private static int uniqueId = 678000;
	private static int radix = 62;
	static String[] elements = { "a", "b", "c", "d", "e", "f", "g", "h", "i",
			"j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v",
			"w", "x", "y", "z", "1", "2", "3", "4", "5", "6", "7", "8", "9",
			"0", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L",
			"M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y",
			"Z" };


	public static void main(String arp[]) {

		String shortenedUrl = shortenURL("http://www.stumbleupon.com/su/28KqXE/www.funnyordie.com/slideshows/ff413570ec/awesomely-inappropriate-test-answers-from-kids/");
		System.out.println("http://tinyurl.com/" + shortenedUrl);
	}

	/**
	 * shorten a url
	 * 
	 * @param string
	 * @return
	 */
	private static String shortenURL(String string) {
		int uniqueId1 = uniqueId++;
		StringBuilder code = new StringBuilder();
		System.out.println();
		while (uniqueId1 > radix) {
			code.append(elements[uniqueId1 % radix]);
			uniqueId1 = uniqueId1 / radix;
		}
		return code.toString();
	}
}
