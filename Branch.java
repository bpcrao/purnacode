/**
 * 
 */

/**
 * @author purnachandrarao
 * 
 */
public class Branch {
	public Branch[] branches;
	public Leaf[] leafs;
	/**
	 * @param leaves
	 */
	public void setLeaves(Leaf[] leaves) {
		this.leafs=leaves;
		
	}
	/**
	 * @param branches2
	 */
	public void setBranches(Branch[] branches2) {
		// TODO Auto-generated method stub
		this.branches=branches2;
	}

}

class Leaf {
	public String color;
}