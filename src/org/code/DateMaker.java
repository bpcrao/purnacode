/**
 * 
 */
package org.code;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @author Purna
 *
 */
public class DateMaker {

	/**
	 * 
	 */
	public DateMaker() {
		
		
	}
	public static void main(String[] args) {
		long timeInMillis=System.currentTimeMillis();
		long oneDayMillis=24*60*60*1000;
		long target=timeInMillis-oneDayMillis;
		SimpleDateFormat sDateFormat = new SimpleDateFormat ("yyyy-MM-dd'T'HH:mm:ss");
		Calendar instance = Calendar.getInstance();
		for (; timeInMillis > target; timeInMillis=timeInMillis-60000) {
			instance.setTimeInMillis(timeInMillis);
			System.out.println(sDateFormat.format(instance.getTime()));
		}
	}

}
