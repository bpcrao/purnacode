package org.code;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

/**
 * 
 */

/**
 * @author Purna
 * 
 */
public class SegregatorTest {

	@Test
	public void testOddSeggregation() {
		Segregator seg = new Segregator();
		int[] oddNumbers = { 1, 3, 5 };
		int index = 0;
		seg.segregate(5);
		List<Integer> oddNumberList = seg.getOddNumbers();
		assertEquals(oddNumberList.size(), 3);
		for (int i = 0; i < oddNumbers.length; i++) {
			assertEquals((int) oddNumberList.get(i), oddNumbers[index++]);

		}

	}

	@Test
	public void testEvenSeggregation() {
		Segregator seg = new Segregator();
		int[] evenNumbers = { 2, 4 };
		int index = 0;
		seg.segregate(5);
		List<Integer> evenList = seg.getEvenNumbers();
		assertEquals(evenList.size(), 2);
		for (int i = 0; i < evenNumbers.length; i++) {
			assertEquals((int) evenList.get(i), evenNumbers[index++]);
		}
	}

	@Test
	public void testPrimeSeggregation() {
		Segregator seg = new Segregator();
		int[] primeNumbers = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41,
				43, 47, 53, 59, 61 };
		int index = 0;
		seg.segregate(62);
		List<Integer> primeList = seg.getPrimeNumbers();
		System.out.println(primeList);
		assertEquals(primeList.size(), 18);
		for (int i = 0; i < primeNumbers.length; i++) {
			assertEquals((int) primeList.get(i), primeNumbers[index++]);
		}
	}

}
