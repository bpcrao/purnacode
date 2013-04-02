/**
 * 
 */
package org.patterns.creational.single;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * @author Purna
 * 
 */
public class EagerSingleton implements Cloneable,Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -795937965346649942L;
	static EagerSingleton instance = new EagerSingleton();

	private EagerSingleton() {
	}

	/**
	 * @return
	 * @throws InterruptedException
	 */
	public static synchronized EagerSingleton getInstance() {
		return instance;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

//	public Object readResolve() throws ObjectStreamException{
//		return getInstance();
//	}
}
