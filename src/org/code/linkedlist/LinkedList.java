/**
 * 
 */
package org.code.linkedlist;

/**
 * @author Purna
 * 
 */
public class LinkedList {

	private Node head = null;

	/**
	 * 
	 */
	public LinkedList() {
	}

	/**
	 * appends a node at the end....
	 * 
	 * @param data
	 */
	public void addNode(int data) {
		Node node = new Node(data);
		Node temp = head;
		if (head == null) {
			head = node;
		}
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = node;
	}

	public boolean deleteNode(int data) {
		Node temp = this.head;

		// deleting the head node
		if (temp.data == data) {
			this.head = temp.next;
			return true;
		}

		
		return false;
	}

}
