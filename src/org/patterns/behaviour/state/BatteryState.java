/**
 * 
 */
package org.patterns.behaviour.state;

/**
 * @author Purna
 * 
 */
public interface BatteryState {

	void charge(int time);

	void makeCall(int time);

	int getCharge();

	void setMobile(Mobile mobile);

	String getName();
}
