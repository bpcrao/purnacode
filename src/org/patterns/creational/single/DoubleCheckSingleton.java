/**
 * 
 */
package org.patterns.creational.single;

/**
 * @author Purna
 * 
 */
public class DoubleCheckSingleton {

	volatile static DoubleCheckSingleton instance;

	private DoubleCheckSingleton() {
	}

	/**
	 * will not work
	 * 
	 * @return
	 * @throws InterruptedException
	 */
	public static DoubleCheckSingleton getInstance()
			throws InterruptedException {
		if (instance == null) {
			synchronized (DoubleCheckSingleton.class) {
				if (instance == null) {
					instance = new DoubleCheckSingleton();
				}
			}
		}
		return instance;
	}

}