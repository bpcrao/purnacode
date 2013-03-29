/**
 * 
 */
package org.code.strings;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Purna
 *
 */
public class AnagramDetectorTest {

	@Test
	public void testAnagram() {
		Assert.assertTrue(AnagramDetector.areAnagram("MARY","ARMY"));
	}
	
	@Test
	public void testAnagram2() {
		Assert.assertTrue(AnagramDetector.areAnagram("MAARY","AARMY"));
	}

}
