/**
 * 
 */
package org.patterns.creational.proto;

/**
 * @author Purna
 * 
 */
public class Proto implements Cloneable {

	public int value;

	Proto() {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.value = 900;
	}

	public Proto clone() throws CloneNotSupportedException {
		return (Proto) super.clone();
	}

}
