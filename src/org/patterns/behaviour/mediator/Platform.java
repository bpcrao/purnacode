/**
 * 
 */
package org.patterns.behaviour.mediator;

/**
 * @author Purna
 *
 */
public class Platform {

	boolean isFree;
	
	boolean isPlatformFree(){
		return isFree;
	}
	
	void occupy(){
		this.isFree=false;
	}
	
	void leave(){
		this.isFree=true;
	}
}
