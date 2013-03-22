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
		ComputerPartsBuilder builder = new ComputerPartsBuilder();
		builder.buildBasicComputer();
		builder.buildMouse();
		return builder.getComputer();
	}

}
