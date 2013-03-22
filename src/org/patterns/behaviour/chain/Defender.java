/**
 * 
 */
package org.patterns.behaviour.chain;

/**
 * @author Purna
 * 
 */
public class Defender extends PlayerIntf {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.patterns.behaviour.chain.PlayerIntf#handleBall()
	 */
	@Override
	public void handleBall() {
		if (ComputerPlayer.getBallLocation() < 30) {
			System.out.println("defending");
		} else {
			this.succesor.handleBall();
		}


	}

}
