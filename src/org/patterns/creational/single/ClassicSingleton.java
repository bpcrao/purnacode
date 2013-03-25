/**
 * 
 */
package org.patterns.creational.single;

import java.util.Timer;

/**
 * @author Purna
 * 
 */
public class ClassicSingleton {

	static ClassicSingleton instance;

	private ClassicSingleton() {
	}

	/**
	 * @return
	 * @throws InterruptedException
	 */
	public static ClassicSingleton getInstance() throws InterruptedException {
		if (instance == null) {
			instance = new ClassicSingleton();
		}
		return instance;
	}
}
