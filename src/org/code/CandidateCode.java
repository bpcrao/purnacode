/**
 * 
 */
package org.code;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Purna
 * 
 */ 
public class CandidateCode {

	static class Node {
		/*
		 * (non-Javadoc)
		 * 
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "Node [value=" + value + ", next=" + next + ", group="
					+ group + "]";
		}

		public static int currGroup = 1;
		String value;
		Node next;
		int group;

		Node(String value) {
			this.value = value;
			this.group = currGroup++;
		}
	};

	static Map<String, Node> nodesMap = new HashMap<String, Node>();

	public static String construction(String[] input1) {
		for (int i = 0; i < input1.length; i++) {
			String from = input1[i].split("#")[0];
			String to = input1[i].split("#")[1];

			if (nodesMap.containsKey(from) && nodesMap.containsKey(to)) {
				if (!isReachable(to, from)) {
					return "No";
				}
			}

			Node fromNode;
			if (nodesMap.containsKey(from)) {
				fromNode = nodesMap.get(from);
			} else {
				fromNode = new Node(from);
			}

			Node toNode;
			if (nodesMap.containsKey(to)) {
				toNode = nodesMap.get(to);
			} else {
				toNode = new Node(to);
			}

			fromNode.next = toNode;
			toNode.group = fromNode.group;

			nodesMap.put(from, fromNode);
			nodesMap.put(to, toNode);
		}

		return "Yes";
	}

	/**
	 * @param to
	 * @param from
	 * @return
	 */
	private static boolean isReachable(String to, String from) {
		Node fromN = nodesMap.get(from);
		Node toN = nodesMap.get(to);
		
		while(fromN.next!=null){
			if(fromN.next==toN){
			return true;	
			}
			fromN=fromN.next;
		}
		return false;
	}


}
