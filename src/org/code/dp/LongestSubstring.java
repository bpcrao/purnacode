package org.code.dp;

public class LongestSubstring {
	static String hello2 = "ABCBDAB";
	static String hello = "BDCABA";
	static int check[][];

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		check = new int[hello.length() + 1][hello2.length() + 1];

		for (int i = 0; i <= hello.length(); i++) {
			for (int j = 0; j <= hello2.length(); j++) {

				check[i][j] = 0;
			}
		}
		LSR2(hello, hello2);
		for (int i = 0; i <= hello.length(); i++) {
			for (int j = 0; j <= hello2.length(); j++) {

				System.out.print(check[i][j] + "  ");
			}
			System.out.println();
		}
		printTheSequence(LSR2(hello, hello2));

	}

	/**
	 * @param i
	 * 
	 */
	private static void printTheSequence(int length) {

		int i = hello.length();
		int j = hello2.length();
		while (i > 0 && j > 0) {
			if (check[i][j] == check[i - 1][j - 1] + 1) {
				System.out.println(hello.charAt(i - 1));
				i--;
				j--;
			} else if (check[i - 1][j] > check[i][j - 1]) {
				i--;
			} else if (check[i - 1][j] <= check[i][j - 1]) {
				j--;
			}

		}

	}

	/**
	 * @param firstWord
	 * @param secondWord
	 * @return
	 */
	private static int LSR2(String firstWord, String secondWord) {
		for (int i = 1; i <= firstWord.length(); i++) {
			for (int j = 1; j <= secondWord.length(); j++) {
				if (firstWord.charAt(i - 1) == secondWord.charAt(j - 1)) {
					check[i][j] = 1 + check[i - 1][j - 1];
				} else {
					check[i][j] = Math.max(check[i - 1][j], check[i][j - 1]);
				}
			}
		}

		return check[firstWord.length()][secondWord.length()];
	}

	private static int LSR(String firstWord, String secondWord) {

		if (firstWord.length() == 0 || secondWord.length() == 0)
			return 0;
		if (check[firstWord.length() - 1][secondWord.length() - 1] > 0) {
			return check[firstWord.length() - 1][secondWord.length() - 1];
		}
		if ((firstWord.charAt(firstWord.length() - 1) == (secondWord
				.charAt(secondWord.length() - 1)))) {
			int lsr = LSR(firstWord.substring(0, firstWord.length() - 1),
					secondWord.substring(0, secondWord.length() - 1)) + 1;
			check[firstWord.length() - 1][secondWord.length() - 1]++;
			if (check[firstWord.length() - 1][secondWord.length() - 1] == 1) {
				System.out.println(firstWord.length() - 1 + " ,"
						+ (secondWord.length() - 1));
				System.out.println(firstWord.charAt(firstWord.length() - 1));
			}
			return lsr;

		} else {
			return Math.max(
					LSR(firstWord.substring(0, firstWord.length() - 1),
							secondWord.substring(0, secondWord.length())),
					LSR(firstWord.substring(0, firstWord.length()),
							secondWord.substring(0, secondWord.length() - 1)));
		}

	}
}
