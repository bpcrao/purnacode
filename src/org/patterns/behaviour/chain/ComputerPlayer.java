/**
 * 
 */
package org.patterns.behaviour.chain;

/**
 * @author Purna
 * 
 */
public class ComputerPlayer {

	private int ballLocation = 0;

	public static void main(String ap[]) {
		PlayerIntf forward = new Forward();
		MidFielder midfielder = new MidFielder();
		forward.setSuccessor(midfielder);
		Defender defender = new Defender();
		midfielder.setSuccessor(defender);
		GoalKeeper keeper = new GoalKeeper();
		defender.setSuccessor(keeper);

		forward.handleBall();
	}

	/**
	 * @return the ballLocation
	 */
	public static int getBallLocation() {
		return (int) Math.rint(90d);
	}

	/**
	 * @param ballLocation
	 *            the ballLocation to set
	 */
	public void setBallLocation(int ballLocation) {
		this.ballLocation = ballLocation;
	}

}
