/**
 * 
 */
package org.patterns.behaviour.chain;

/**
 * @author Purna
 *
 */
public class GoalKeeper extends PlayerIntf {

	/* (non-Javadoc)
	 * @see org.patterns.behaviour.chain.PlayerIntf#handleBall()
	 */
	@Override
	public void handleBall() {
		if (ComputerPlayer.getBallLocation() < 10) {
			System.out.println("goaal keeper");
		} else {
			System.out.println("GOAL");
		}

	}



}
