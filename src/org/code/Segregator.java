package org.code;
import java.util.ArrayList;
import java.util.List;

/**
 * Class which segregates if numbers are prime/even/odd
 */

/**
 * @author purna
 * 
 */
public class Segregator {

	private List<Integer> oddNumbers = new ArrayList<Integer>();
	private List<Integer> evenNumbers = new ArrayList<Integer>();
	private List<Integer> primeNumbers = new ArrayList<Integer>();

	/**
	 * segregates odd even and prime numbers
	 * 
	 * @param maxNumber
	 */
	public void segregate(int maxNumber) {
		for (int number = 1; number <= maxNumber; number++) {
			if (number % 2 != 0) {
				oddNumbers.add(Integer.valueOf(number));
			} else {
				evenNumbers.add(Integer.valueOf(number));
			}
			if (isPrime(number)) {
				primeNumbers.add(Integer.valueOf(number));
			}
		}

	}

	/**
	 * check if a number is prime or not.
	 * 
	 * @param number
	 * @return
	 */
	private boolean isPrime(int number) {
		if (number == 1) {
			return false;
		}
		for (int index = 2; index <= Math.sqrt(number); index++) {
			if (((double) number % (double) index)  == 0d) {
				return false;
			}
		}
		return true;
	}

	/**
	 * @return
	 */
	public List<Integer> getOddNumbers() {

		return oddNumbers;
	}

	/**
	 * @return
	 */
	public List<Integer> getEvenNumbers() {
		return evenNumbers;
	}

	/**
	 * @return
	 */
	public List<Integer> getPrimeNumbers() {
		return primeNumbers;
	}

}
