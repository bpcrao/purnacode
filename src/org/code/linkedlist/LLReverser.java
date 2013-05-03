/**
 * 
 */
package org.code.linkedlist;

/**
 * @author Purna
 * 
 */
public class LLReverser {

	public LLReverser() {
		/**
		 * reverse(a->,reverse(b->,c));
		 * 
		 */
	}

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.addNode(1);
		linkedList.addNode(2);
		linkedList.addNode(3);
		linkedList.addNode(4);
		linkedList.addNode(5);
		reverseLinkedList(linkedList.head, linkedList);
		linkedList.printLinkedList();
	}

	/**
	 * a->b->c reverse(b->c)->a reverse(c)->b->a
	 * 
	 * @param linkedList
	 * 
	 * @param head
	 * @return
	 */
	private static Node reverseLinkedList(Node node, LinkedList linkedList) {
		if (node.next == null) {
			linkedList.head = node;
			return node;
		}

		Node nodeRev = reverseLinkedList(node.next, linkedList);
		node.next = null;
		nodeRev.next = node;
		return node;
	}
}
