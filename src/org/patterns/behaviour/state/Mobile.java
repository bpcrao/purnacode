package org.patterns.behaviour.state;

/**
 * @author Purna
 * 
 */
public class Mobile {

	BatteryState batteryState;

	Mobile() {
	}

	/**
	 * @param state
	 */
	public void setState(BatteryState state) {
		System.out.println("State Changed from "+(this.batteryState!=null?this.batteryState.getName():"firsttime")+" To "+state.getName());
		this.batteryState = state;
		state.setMobile(this);
	}

	/**
	 * @param i
	 */
	public void charge(int i) {
		this.batteryState.charge(i);

	}

	/**
	 * @param i
	 */
	public void makeCall(int i) {
		this.batteryState.useCharge(i);

	}

	/**
	 * 
	 */
	public void printCharge() {
		System.out.println("Charge is "+this.batteryState.getCharge());

	}

}
