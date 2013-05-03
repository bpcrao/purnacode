/**
 * 
 */
package org.code.linkedlist;

/**
 * @author Purna
 * 
 */
public class LinkedList {

	public Node head = null;

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
			return;
		}
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = node;
	}

	/**
	 * deletes a node from linked list
	 * 
	 * @param data
	 * @return
	 */
	public boolean deleteNode(int data) {
		Node temp = this.head;

		// deleting the head node
		if (temp.data == data) {
			this.head = temp.next;
			return true;
		}
		temp = temp.next;
		Node prev = temp;
		while (temp != null) {
			if (temp.data == data) {
				prev.next = temp.next;
				return true;
			}
			prev = temp;
			temp = temp.next;
		}

		return false;
	}

	public void printLinkedList() {
		
		Node temp = head;
		while (temp != null) {
			
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println();
	}

}
