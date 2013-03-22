/**
 * 
 */
package org.patterns.creational.builder;

/**
 * @author Purna
 * 
 */
public class ComputerPartsBuilder {

	IComputer computer;

	/**
	 * 
	 */
	public void buildBasicComputer() {
		computer = new BasicComputer();
	}

	public void buildMouse() {
		computer.addMouse();
	}

	public void buildWebCam() {
		computer.addCam();
	}

	public void buildSpeakers() {
		computer.addSpeakers();
	}

	/**
	 * 
	 */
	public IComputer getComputer() {
		return computer;
	}

}
