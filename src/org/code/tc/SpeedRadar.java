/**
 * 
 */
package org.code.tc;

/**
 * @author Purna
 * 
 */
public class SpeedRadar {

	/**
	 * 
	 */
	public SpeedRadar() {
	}

	public double averageSpeed(int minLimit, int maxLimit, int[] readings) {

		int inf = 0;
		double total = 0.0d;
		for (int i = 0; i < readings.length; i++) {
			if (readings[i] > maxLimit || readings[i] < minLimit) {
				inf++;
			}else{
				total += readings[i];
			}
			
		}

		if ((100 * inf / readings.length) > 10) {
			return 0.0;
		} else {
			return (total / (readings.length-inf));
		}
	}


}
