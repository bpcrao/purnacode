/**
 * 
 */
package org.patterns.behaviour.state;

/**
 * @author Purna
 * 
 */
public class LowState implements BatteryState {

	private Mobile mobile;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.patterns.behaviour.state.BatteryState#charge(int)
	 */
	@Override
	public void charge(int time) {
	ChargingState state = new ChargingState();
	mobile.setState(state);
	state.charge(time);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.patterns.behaviour.state.BatteryState#makeCall(int)
	 */
	@Override
	public void useCharge(int time) {
		System.out.println("Battery Too Low");

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.patterns.behaviour.state.BatteryState#getCharge()
	 */
	@Override
	public int getCharge() {
		return 10;
	}

	/**
	 * @param mobile
	 */
	public void setMobile(Mobile mobile) {
		this.mobile = mobile;

	}

	/* (non-Javadoc)
	 * @see org.patterns.behaviour.state.BatteryState#getName()
	 */
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "LOW";
	}

}
