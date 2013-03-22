/**
 * 
 */
package org.patterns.creational.proto;

/**
 * @author Purna
 *
 */
public class ProtoUser {

	public static void main(String ar[]) throws CloneNotSupportedException{
		System.out.println(System.currentTimeMillis());
		Proto prot=new Proto();
		System.out.println(System.currentTimeMillis());
		Proto protClone=prot.clone();		
		System.out.println(System.currentTimeMillis());
		
	}
}
