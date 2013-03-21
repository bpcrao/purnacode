package org.code;
import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 */

/**
 * @author Purna
 * 
 */
public class BranchPainterTest {

	@Test
	public void test() {
		Branch mainBranch = new Branch();
		BranchPainter.createSubBranches(mainBranch, 5);
		BranchPainter.paintAllRed(mainBranch);

		checkifAllAreRed(mainBranch);
	}

	/**
	 * @param mainBranch
	 */
	private void checkifAllAreRed(Branch mainBranch) {
		if (mainBranch.leafs != null) {
			for (int i = 0; i < mainBranch.leafs.length; i++) {
				assertEquals("red",mainBranch.leafs[i].color);
			}
			
			for (int i = 0; i < mainBranch.branches.length; i++) {
				checkifAllAreRed(mainBranch.branches[i]);
			}
			
		}

	}

}
