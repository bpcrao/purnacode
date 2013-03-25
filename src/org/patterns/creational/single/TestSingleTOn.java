/**
 * 
 */
package org.patterns.creational.single;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Purna
 *
 */
public class TestSingleTOn {

	@Test
	public void testCloneSIngleTOn() throws CloneNotSupportedException {
		EagerSingleton eagerSingleton=EagerSingleton.getInstance();
		EagerSingleton eagerClone= (EagerSingleton) eagerSingleton.clone();
		System.out.println(eagerSingleton);
		System.out.println(eagerClone);
	}

	
	@Test
	public void testSerialization() throws Exception {
		EagerSingleton eagerSingleton=EagerSingleton.getInstance();
		
	}
}
