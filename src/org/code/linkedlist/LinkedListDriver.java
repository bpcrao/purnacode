/**
 * 
 */
package org.code.linkedlist;

/**
 * @author Purna
 * 
 */
public class LinkedListDriver {

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.printLinkedList();
		linkedList.addNode(1);
		linkedList.addNode(2);
		linkedList.addNode(3);
		linkedList.addNode(4);
		linkedList.printLinkedList();
		linkedList.deleteNode(3);
		linkedList.printLinkedList();

	}

}
