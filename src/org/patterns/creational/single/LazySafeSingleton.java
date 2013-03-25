/**
 * 
 */
package org.patterns.creational.single;

/**
 * @author Purna
 * 
 */
public class LazySafeSingleton {

	static LazySafeSingleton instance;

	private LazySafeSingleton() {
	}

	/**
	 * @return
	 * @throws InterruptedException
	 */
	public static synchronized LazySafeSingleton getInstance() {
		if (instance == null) {
			instance = new LazySafeSingleton();
		}
		return instance;
	}

}
