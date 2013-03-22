/**
 * 
 */
package org.patterns.creational.builder;

/**
 * @author Purna
 *
 */
public interface ComputerBuilderIntf {

	/**
	 * 
	 */
	public abstract void buildBasicComputer();
	public abstract void buildMouse();
	public abstract void buildWebCam();
	public abstract void buildSpeakers();
	public abstract IComputer getComputer();

}


