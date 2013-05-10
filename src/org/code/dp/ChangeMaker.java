/**
 * 
 */
package org.code.dp;

public class ChangeMaker {

	static int makeChange(int amount, int denomination) {

		if (denomination == 1) {
			System.out.println("notes: " + amount + " denom " + denomination);
			System.out.println("---------------------------------------");
			return 1;
		}
		int next_denom = getNextDenom(denomination);
		int ways = 0;
		for (int notes = 0; notes * denomination <= amount; notes++) {
			System.out.println("notes: " + notes + " denom " + denomination);
			ways += makeChange(amount - notes * denomination, next_denom);
		}
		return ways;
	}

	private static int getNextDenom(int denom) {
		switch (denom) {
		case 5:
			return 2;
		case 2:
			return 1;
		case 1:
			return 1;
		}
		return 0;

	}
}
