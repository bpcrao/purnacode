/**
 * 
 */
package org.code.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Purna
 * 
 */
public class BinarySearchTree<Key extends Comparable<Key>, Value> {
	Node<Key, Value> root;

	public void addNode(Key key, Value val) {
		addNode(this.root, key, val);
	}

	public Node<Key, Value> addNode(Node<Key, Value> node, Key key, Value value) {
		if (node == null) {
			Node<Key, Value> nodeTemp = new Node<Key, Value>(key, value);
			if (this.root == null) {
				this.root = nodeTemp;
			}
			return nodeTemp;
		}
		int compareTo = key.compareTo((Key) node.keyT);
		if (compareTo < 0) {
			node.left = addNode(node.left, key, value);
		} else if (compareTo > 0) {
			node.right = addNode(node.right, key, value);
		} else {
			node.keyT = key;
			node.value = value;
		}
		return node;
	}

	Node<Key, Value> getNode(Key key) {
		Node<Key, Value> node = this.root;
		while (node != null) {
			int cmp = key.compareTo((Key) node.keyT);
			if (cmp < 0) {
				node = node.left;
			} else if (cmp > 0) {
				node = node.right;
			} else if (cmp == 0) {
				return node;
			}
		}
		return null;
	}

	private static void printInOrder(Node<Integer, String> node) {
		if (node == null) {
			return;
		}
		printInOrder(node.left);
		System.out.println(node.value);
		printInOrder(node.right);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BinarySearchTree<Integer, String> bst = new BinarySearchTree<Integer, String>();
		bst.addNode(new Integer(7), "seven");
		bst.addNode(new Integer(8), "eight");
		bst.addNode(new Integer(9), "nine");
		bst.addNode(new Integer(15), "five");
		bst.addNode(new Integer(16), "six");
		bst.addNode(new Integer(14), "four");
		bst.addNode(new Integer(13), "three");
		bst.addNode(new Integer(10), "ten");
		bst.addNode(new Integer(12), "two");
		bst.addNode(new Integer(11), "one");
		printInOrder(bst.root);
		checkifitsBalancedTree(bst.root);
		List<List<Node>> nodeList = new ArrayList<List<Node>>();
		ArrayList<Node> element = new ArrayList<Node>();
		element.add(bst.root);
		nodeList.add(element);
		makeLevelOrderList(nodeList, 0);

		System.out.println(nodeList);

	}

	/**
	 * @param node
	 * @param nodeList
	 */
	private static void makeLevelOrderList(List<List<Node>> nodeList, int level) {
		List<Node> list = nodeList.get(level);
		List<Node> listSub = new ArrayList<Node>();
		for (Node nodeT : list) {
			if (nodeT.left != null) {
				listSub.add(nodeT.left);

			}
			if (nodeT.right != null) {
				listSub.add(nodeT.right);
			}
		}
		if (listSub.size() > 0) {
			level++;
			nodeList.add(listSub);
			makeLevelOrderList(nodeList, level);
		}

	}

	/**
	 * @param node
	 */
	private static void checkifitsBalancedTree(Node<Integer, String> node) {
		int minHeight = getMinHeight(node);
		int maxHeight = getMaxHeight(node);
		System.out.println(maxHeight);
		if (maxHeight - minHeight > 1) {
			System.out.println("its not a balanced tree");
		} else {
			System.out.println("its  balanced tree");
		}

	}

	/**
	 * @param node
	 * @return
	 */
	private static int getMaxHeight(Node<Integer, String> node) {
		if (node == null) {
			return 0;
		}
		return 1 + Math.max(getMaxHeight(node.left), getMaxHeight(node.right));
	}

	/**
	 * @param node
	 * @return
	 */
	private static int getMinHeight(Node<Integer, String> node) {
		if (node == null) {
			return 0;
		}
		return 1 + Math.min(getMinHeight(node.left), getMinHeight(node.right));
	}
}

class Node<T extends Comparable<T>, Value> {
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Node [keyT=" + keyT + "]";
	}

	T keyT;
	Value value;
	Node<T, Value> left;
	Node<T, Value> right;

	Node(T key, Value val) {
		this.keyT = key;
		this.value = val;
	}
}