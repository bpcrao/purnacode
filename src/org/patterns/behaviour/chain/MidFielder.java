/**
 * 
 */
package org.patterns.behaviour.chain;

/**
 * @author Purna
 *
 */
public class MidFielder extends PlayerIntf {

	/* (non-Javadoc)
	 * @see org.patterns.behaviour.chain.PlayerIntf#handleBall()
	 */
	@Override
	public void handleBall() {
		if (ComputerPlayer.getBallLocation() < 70) {
			System.out.println("mid player ");
		} else {
			this.succesor.handleBall();
		}


	}



}
