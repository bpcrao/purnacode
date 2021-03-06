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
			node.left.isRight = false;
			node.left.parent = node;
		} else if (compareTo > 0) {
			node.right = addNode(node.right, key, value);
			node.left.isRight = true;
			node.right.parent = node;
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
		bst.addNode(new Integer(5), "5");
		bst.addNode(new Integer(6), "6");
		bst.addNode(new Integer(3), "3");
		bst.addNode(new Integer(8), "8");
		bst.addNode(new Integer(4), "4");
		bst.addNode(new Integer(7), "7");
		bst.addNode(new Integer(2), "2");
		bst.addNode(new Integer(10), "10");
		bst.addNode(new Integer(1), "1");
		bst.addNode(new Integer(9), "9");
		// printInOrder(bst.root);
		// checkifitsBalancedTree(bst.root);
		List<List<Node>> nodeList = new ArrayList<List<Node>>();
		ArrayList<Node> element = new ArrayList<Node>();
		element.add(bst.root);
		nodeList.add(element);
		makeLevelOrderList(nodeList, 0);

		for (List<Node> lis : nodeList) {
			System.out.println(lis);
		}

	
		// Node in = inOrderSuccessorOf(6, bst.root);
		// System.out.println(in);
	}





	/**
	 * @param i
	 * @param root
	 * @return
	 */
	private static Node inOrderSuccessorOf(int i, Node<Integer, String> root) {
		Node subNode = findNode(i, root);
		if (subNode.right != null) {
			return findLeftMost(subNode.right);
		}
		return null;
	}

	/**
	 * @param right
	 * @return
	 */
	private static Node findLeftMost(Node right) {
		if (right.left == null) {
			return right;
		}
		while (right.left != null) {
			return findLeftMost(right.left);
		}
		return right;
	}

	/**
	 * @param i
	 * @param root
	 * @return
	 */
	private static Node findNode(int i, Node<Integer, String> root) {

		if (i > root.keyT) {
			return findNode(i, root.right);
		} else if (i < root.keyT) {
			return findNode(i, root.left);
		} else if (i == root.keyT) {
			return root;
		}
		return null;
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
		return "" + keyT;
	}

	T keyT;
	Value value;
	Node<T, Value> left;
	Node<T, Value> right;
	Node<T, Value> parent;
	public boolean isRight;

	Node(T key, Value val) {
		this.keyT = key;
		this.value = val;
	}
}