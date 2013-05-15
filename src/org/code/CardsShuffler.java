package org.code;
import java.util.Arrays;
import java.util.Random;

/**
 * @author Purna
 * 
 *         this class just shuffles the given set of cards assuming there are 52
 *         cards 1-52
 */ 
public class CardsShuffler {

	public static Random randomGenerator = new Random();

	public static void main(String args[]) {
		int[] cards = new int[5];
		for (int index = 0; index < cards.length; index++) {
			cards[index] = index + 1;
		}

		printCards(cards);
		shuffleCards(cards);
	}

	/**
	 * shuffles the cards using
	 * 
	 * Knuth Shuffle
	 * 
	 * @param cards
	 */
	private static void shuffleCards(int[] cards) {

		for (int index = 1; index < cards.length; index++) {
			int cardToShuffleWith = randomGenerator.nextInt(index);
			swapNumbers(cards, index, cardToShuffleWith);
			// printing the cards on every shuffle
			printCards(cards);
		}

	}

	/**
	 * Swaps two Cards
	 * 
	 * @param cards
	 * @param index
	 * @param cardToShuffleWith
	 */
	private static void swapNumbers(int[] cards, int index,
			int cardToShuffleWith) {
		int temp = cards[index];
		cards[index] = cards[cardToShuffleWith];
		cards[cardToShuffleWith] = temp;
	}

	/**
	 * prints the cards
	 * 
	 * @param cards
	 */
	private static void printCards(int[] cards) {
		System.out.println(Arrays.toString(cards));
	}

}
