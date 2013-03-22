/**
 * 
 */
package org.patterns.creational.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Purna
 * 
 */
public class BasicComputer implements IComputer {

	List<String> accessories = new ArrayList<String>();

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.patterns.creational.builder.IComputer#addMouse()
	 */
	@Override
	public void addMouse() {
		accessories.add("Mouse");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.patterns.creational.builder.IComputer#addCam()
	 */
	@Override
	public void addCam() {
		accessories.add("Cam");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.patterns.creational.builder.IComputer#addSpeakers()
	 */
	@Override
	public void addSpeakers() {
		accessories.add("Speakers");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BasicComputer [accessories=" + accessories + "]";
	}

}
