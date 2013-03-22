/**
 * 
 */
package org.patterns.behaviour.memento;

/**
 * @author Purna
 *
 */
public class CareTaker {

	public static void main(String arp[]){
		Editor editor=new Editor();
		
		editor.save("hello");
		System.out.println(editor.contents);
		editor.save("hello2");
		System.out.println(editor.contents);
		editor.restore();
		System.out.println(editor.contents);
	}
}
