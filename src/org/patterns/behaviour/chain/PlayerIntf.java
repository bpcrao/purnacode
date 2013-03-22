/**
 * 
 */
package org.patterns.behaviour.chain;

/**
 * @author Purna
 * 
 */
public abstract class PlayerIntf {

	PlayerIntf succesor;

	abstract void handleBall();

	void setSuccessor(PlayerIntf succesor) {
		this.succesor = succesor;
	}
}
