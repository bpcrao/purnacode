package org.code;
/**
 * Class which defines the data structure
 * of branch and leaves
 */
 
/**
 * @author Purna
 * 
 */
public class Branch {
	public Branch[] branches;
	public Leaf[] leafs;

	/**
	 * @param leaves
	 */
	public void setLeaves(Leaf[] leaves) {
		this.leafs = leaves;

	}

	/**
	 * @param branches
	 */
	public void setBranches(Branch[] branches) {
		this.branches = branches;
	}

}

class Leaf {
	public String color;
}