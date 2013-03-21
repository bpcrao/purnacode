/**
 * 
 */
package org.patterns.behaviour.state;

/**
 * @author Purna
 * 
 */
public class MobileUser {

	public static void main(String ap[]) {

		Mobile newMobile = new Mobile();
		newMobile.setState(new FullState());

		// STATE: FULL
		newMobile.printCharge();
		// a fully charged mobile on charge shud say "Battery is full"
		newMobile.charge(10);
		// a fully charged battery if user talks for 90 mins will go to low mode
		newMobile.makeCall(90); // change full to low
		// STATE:LOW
		newMobile.printCharge();
		// a low charged mobile on call "Battery is LOW"
		newMobile.makeCall(90); // change full to low

		// STATE CHARGING
		newMobile.charge(10);
		// should move to full again

	}

}
