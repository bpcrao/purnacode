/**
 * 
 */
package org.code.linkedlist;

/**
 * @author Purna
 * 
 */
public class NthElement {

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();

		linkedList.addNode(1);
		linkedList.addNode(2);
		linkedList.addNode(3);
		linkedList.addNode(4);
		linkedList.addNode(5);
		linkedList.addNode(6);
		linkedList.addNode(7);
		linkedList.addNode(8);
		linkedList.addNode(9);
		linkedList.addNode(10);
		linkedList.printLinkedList();
		deleteNthElement(linkedList, 7);
	}

	/**
	 * @param linkedList
	 * @param nTH
	 */
	private static void deleteNthElement(LinkedList linkedList, int nTH) {
		Node previous = linkedList.head;
		Node firstPtr = linkedList.head;
		Node secondPtr = linkedList.head;
		int counter = 0;
		while (secondPtr.next != null) {
			secondPtr = secondPtr.next;
			if (counter >= nTH - 1) {
				firstPtr = previous;
				previous = previous.next;
			}
			counter++;
		}
		System.out.println("previous=" + firstPtr.data);
		System.out.println("delete nth element=" + firstPtr.next.data);
		System.out.println("next=" + firstPtr.next.next.data);

	}

}
