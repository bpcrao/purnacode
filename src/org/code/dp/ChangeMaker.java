/**
 * 
 */
package org.code.dp;

/**
 * @author Purna
 * 
 */
public class ChangeMaker {

	static int makeChange(int amount, int denomination) {

		if (denomination == 1) {
			System.out.println("notes: " + amount + " denom " + denomination);
			System.out.println("---------------------------------------");
			return 1;
		}
	 	int next_denom = getNextDenom(denomination);

		int notes, ways = 0;
		for (notes = 0; notes * denomination <= amount; notes++) {
			System.out.println("notes: " + notes + " denom " + denomination);
			ways += makeChange(amount - notes * denomination, next_denom);

		}
		return ways;
	}

	private static int getNextDenom(int denom) {
		switch (denom) {
		case 25:
			return 10;
		case 10:
			return 5;
		case 5:
			return 1;
		case 1:
			return 1;
		}
		return 0;

	}

	public static void main(String[] args) {
		System.out.println(ChangeMaker.makeChange(30, 25));
	}
}
