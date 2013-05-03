/**
 * 
 */
package org.code.linkedlist;

/**
 * @author Purna
 * 
 */
public class LinkedListAdder {

	/**
	 * <pre>
	 * 	   9->2->3
	 * 	   4->5->6
	 * 	   -------
	 * 	   3->8->8
	 * 	   -------
	 * </pre>
	 */
	public LinkedListAdder() {
	}

	/*
	 * 
	 */
	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.addNode(9);
		linkedList.addNode(6);
		linkedList.addNode(4);

		LinkedList linkedListTwo = new LinkedList();
		linkedListTwo.addNode(4);
		linkedListTwo.addNode(5);
		// linkedListTwo.addNode(6);

		linkedList.printLinkedList();
		linkedListTwo.printLinkedList();

		LinkedList result = addLinkedLists(linkedList, linkedListTwo);
		
		System.out.println("------------------");
		System.out.println("Result Linked List");
		result.printLinkedList();
		System.out.println("------------------");
	}
 
	/**
	 * @param linkedList
	 * @param linkedListTwo
	 * @return
	 */
	private static LinkedList addLinkedLists(LinkedList linkedList,
			LinkedList linkedListTwo) {
		LinkedList result = new LinkedList();
		Node first = linkedList.head;
		Node second = linkedListTwo.head;
		int carryForward = 0;
		while (first != null || second != null) {

			result.addNode(((first == null ? 0 : first.data)
					+ (second == null ? 0 : second.data) + carryForward) % 10);
			carryForward = ((first == null ? 0 : first.data)
					+ (second == null ? 0 : second.data) + carryForward) / 10;

			if (first != null)
				first = first.next;
			if (second != null)
				second = second.next;
		}
		if (carryForward > 0) {
			result.addNode(carryForward);
		}

		return result;
	}

}
