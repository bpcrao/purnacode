/**
 * 
 */
package org.patterns.behaviour.mediator;

/**
 * @author Purna
 * 
 */
public class StationMediator {

	Platform pf = new Platform();
	Train tr = new Train();

	void checkIfTrainCanCome() {

		if (tr.isComingtoStation() && pf.isPlatformFree()) {
			tr.occupyPlatform();
			System.out.println("ANNOUNCE TO PASSENGERS");
		}
		if (tr.isComingtoStation() && !pf.isPlatformFree()) {
			System.out.println("SHOW RED FLAG");
		}
		

	}

}
