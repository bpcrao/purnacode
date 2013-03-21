/**
 * 
 */
package org.patterns.behaviour.state;

/**
 * @author Purna
 * 
 */
public class ChargingState implements BatteryState {

	private Mobile mobile;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.patterns.behaviour.state.BatteryState#charge(int)
	 */
	@Override
	public void charge(int timeinSeconds) {

		for (int i = 0; i < timeinSeconds; i++) {
			System.out.println("-");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException intEx) {
				intEx.printStackTrace();
			}
		}

		if (timeinSeconds == 10) {
			mobile.setState(new FullState());
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.patterns.behaviour.state.BatteryState#makeCall(int)
	 */
	@Override
	public void useCharge(int time) {
		System.out.println("Call");

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.patterns.behaviour.state.BatteryState#getCharge()
	 */
	@Override
	public int getCharge() {
		return (int) Math.rint(70);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.patterns.behaviour.state.BatteryState#setMobile(org.patterns.behaviour
	 * .state.Mobile)
	 */
	@Override
	public void setMobile(Mobile mobile) {
		this.mobile = mobile;

	}

	/* (non-Javadoc)
	 * @see org.patterns.behaviour.state.BatteryState#getName()
	 */
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Charging";
	}

}
