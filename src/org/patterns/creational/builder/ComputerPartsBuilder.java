/**
 * 
 */
package org.patterns.creational.builder;

/**
 * @author Purna
 * 
 */
public class ComputerPartsBuilder implements ComputerBuilderIntf {

	IComputer computer;

	/* (non-Javadoc)
	 * @see org.patterns.creational.builder.ComputerBuilderIntf#buildBasicComputer()
	 */
	@Override
	public void buildBasicComputer() {
		computer = new BasicComputer();
	}

	/* (non-Javadoc)
	 * @see org.patterns.creational.builder.ComputerBuilderIntf#buildMouse()
	 */
	@Override
	public void buildMouse() {
		computer.addMouse();
	}

	/* (non-Javadoc)
	 * @see org.patterns.creational.builder.ComputerBuilderIntf#buildWebCam()
	 */
	@Override
	public void buildWebCam() {
		computer.addCam();
	}

	/* (non-Javadoc)
	 * @see org.patterns.creational.builder.ComputerBuilderIntf#buildSpeakers()
	 */
	@Override
	public void buildSpeakers() {
		computer.addSpeakers();
	}

	/* (non-Javadoc)
	 * @see org.patterns.creational.builder.ComputerBuilderIntf#getComputer()
	 */
	@Override
	public IComputer getComputer() {
		return computer;
	}

}
