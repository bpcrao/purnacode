package org.code;
/**
 * Class which paints the leaves red
 * also creates a mock branches and leaves
 * 
 */

/**
 * @author Purna
 *  
 */
public class BranchPainter {

	/**
	 * paints all leaves red
	 * 
	 * @param mainBranch
	 */
	public static void paintAllRed(Branch mainBranch) {

		for (int i = 0; mainBranch.leafs != null && i < mainBranch.leafs.length; i++) {
			mainBranch.leafs[i].color = "red";
		}

		for (int i = 0; mainBranch.branches != null
				&& i < mainBranch.branches.length; i++) {
			paintAllRed(mainBranch.branches[i]);
		}

	}

	/**
	 * just creates branches and leaves
	 * 
	 * @param mainBranch
	 * @param numberOfBranches
	 */
	public static void createSubBranches(Branch mainBranch, int numberOfBranches) {
		if (numberOfBranches == 0)
			return;
		Branch branches[] = new Branch[numberOfBranches];
		Leaf leaves[] = new Leaf[numberOfBranches];
		numberOfBranches--;
		for (int index = 0; index <= numberOfBranches; index++) {
			branches[index] = new Branch();
			leaves[index] = new Leaf();
			createSubBranches(branches[index], numberOfBranches);

		}
		mainBranch.setBranches(branches);
		mainBranch.setLeaves(leaves);
	}

}
