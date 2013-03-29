/**
 * 
 */
package org.code.linkedlist;

/**
 * @author Purna
 * 
 */
public class Node {

	private int data;
	private Node next;

	/**
	 * 
	 */
	public Node(int data) {
		this.data = data;
	}

	/**
	 * appends a node at the end....
	 * 
	 * @param data
	 */
	public void appendNodeatEnd(int data) {
		Node node = new Node(data);
		Node temp = this;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = node;
	}

}
