/**
 * 
 */
package org.code.recursion;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

/**
 * @author Purna
 * 
 */
public class TestPermutations {

	@Test
	public void testSingle() {
		Permutations permutations = new Permutations();
		List<String> list = Permutations.permute(new String("A"));
		assertEquals(1,list.size());
	}

	
	@Test
	public void testDouble() {
		Permutations permutations = new Permutations();
		List<String> list = Permutations.permute(new String("ABC"));
		System.out.println(list);
		assertEquals(6,list.size());
		assertEquals("[ABC, BAC, BCA, ACB, CAB, CBA]",list.toString());
	}
}
 