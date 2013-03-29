/**
 * 
 */
package org.patterns.creational.single;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.patterns.creational.single.EagerSingleton;

/**
 * @author Purna
 * 
 */
public class Driver {

	/**
	 * @param args
	 * @throws IOException
	 * @throws InterruptedException
	 */
	public static void main(String[] args) {
		EagerSingleton instance = EagerSingleton.getInstance();
		System.out.println(instance);
		serializeSingleton(instance);
		EagerSingleton deserSingleton= deserializeSingleton();
		System.out.println(deserSingleton);
	}

	private static EagerSingleton deserializeSingleton() {
		FileInputStream fileIn;
		try {
			fileIn = new FileInputStream("singleton.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			EagerSingleton readSingleton = (EagerSingleton) in.readObject();			
			in.close();
			fileIn.close();
			return readSingleton;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * @param instance
	 */
	private static void serializeSingleton(EagerSingleton instance) {
		try {
			FileOutputStream fileOut = new FileOutputStream("singleton.ser");
			ObjectOutputStream out;

			out = new ObjectOutputStream(fileOut);
			out.writeObject(instance);
			out.close();
			fileOut.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
