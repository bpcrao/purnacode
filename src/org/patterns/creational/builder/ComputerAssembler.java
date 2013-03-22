/**
 * 
 */
package org.patterns.creational.builder;

/**
 * @author Purna
 * 
 */
public class ComputerAssembler {

	public IComputer assembleComputer() {
		ComputerBuilderIntf builder = new ComputerPartsBuilder();
		builder.buildBasicComputer();
		builder.buildMouse();
		return builder.getComputer();
	}

}
