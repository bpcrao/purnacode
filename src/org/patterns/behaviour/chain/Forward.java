/**
 * 
 */
package org.patterns.behaviour.chain;

/**
 * @author Purna
 * 
 */
public class Forward extends PlayerIntf {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.patterns.behaviour.chain.PlayerIntf#handleBall()
	 */
	@Override
	public void handleBall() {
		if (ComputerPlayer.getBallLocation() < 100) {
			System.out.println("forward player attacking");
		} else {
			this.succesor.handleBall();
		}

	}

}
