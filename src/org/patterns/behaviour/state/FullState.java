/**
 * 
 */
package org.patterns.behaviour.state;

/**
 * @author Purna
 *
 */
public class FullState implements BatteryState {

	int battery=100;
	Mobile mobile;
	
	public FullState(Mobile mob){
		this.mobile=mob;
	}
	
	/**
	 * 
	 */
	public FullState() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see org.patterns.behaviour.state.BatteryState#charge(int)
	 */
	@Override
	public void charge(int time) {
		System.out.println("Battery is FULL");
		
	}

	/* (non-Javadoc)
	 * @see org.patterns.behaviour.state.BatteryState#makeCall(int)
	 */
	@Override
	public void makeCall(int time) {
		if(time>70){		
		mobile.setState(new LowState());
		}
		
	}
	
	public int getCharge(){
		return this.battery;
	}

	/* (non-Javadoc)
	 * @see org.patterns.behaviour.state.BatteryState#setMobile(org.patterns.behaviour.state.Mobile)
	 */
	@Override
	public void setMobile(Mobile mobile) {
		this.mobile=mobile;
		
	}

	/* (non-Javadoc)
	 * @see org.patterns.behaviour.state.BatteryState#getName()
	 */
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "FULL";
	}

}
