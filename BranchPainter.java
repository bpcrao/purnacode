/**
 * 
 */

/**
 * @author purnachandrarao
 * 
 */
public class BranchPainter {

	/**
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
	 * @param mainBranch
	 * @param i
	 */
	public static void createSubBranches(Branch mainBranch, int i) {
		if (i == 0)
			return;
		Branch branches[] = new Branch[i];
		Leaf leaves[] = new Leaf[i];
		i--;
		for (int j = 0; j <= i; j++) {
			branches[j] = new Branch();
			leaves[j] = new Leaf();
			createSubBranches(branches[j], i);

		}
		mainBranch.setBranches(branches);
		mainBranch.setLeaves(leaves);

	}

}
