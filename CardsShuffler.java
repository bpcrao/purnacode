import java.util.Arrays;
import java.util.Random;

/**
 * @author Purna
 * 
 */
public class CardsShuffler {
	
	public static Random randomGenerator = new Random();
	
	public static void main(String args[]) {
		int[] cards = new int[52];
		for (int index = 0; index < cards.length; index++) {
			cards[index] = index + 1;
		}

		printCards(cards);
		shuffleCards(cards);
	}

	private static void shuffleCards(int[] cards) {

		for (int index = 1; index < cards.length; index++) {
			int cardToShuffleWith = randomGenerator.nextInt(index);
			swapNumbers(cards, index, cardToShuffleWith);
			System.out.println(index+"<=>"+cardToShuffleWith);
			printCards(cards);
		}

	}

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
