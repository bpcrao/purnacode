/**
 * 
 */
package org.code.shortestpath;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Purna
 * 
 */
public class Krushkal {

	static int optimalCost;
	static List<Edge> nodes = new ArrayList<Edge>();
	static Map<String, String> map = new HashMap<String, String>();

	class Edge implements Comparable<Edge> {
		/*
		 * (non-Javadoc)
		 * 
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "Node [path=" + path + ", cost=" + cost + ", groupA="
					+ groupA + ", groupB=" + groupB + "]";
		}

		String path;
		int cost;
		String groupA;
		String groupB;

		/**
		 * @param string
		 * @param i
		 * @param j
		 */
		public Edge(String string, int i, String j, String k) {
			this.path = string;
			this.cost = i;
			this.groupA = j;
			this.groupB = k;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see java.lang.Comparable#compareTo(java.lang.Object)
		 */
		@Override
		public int compareTo(Edge o) {
			return this.cost - o.cost;
		}
	}

	public static int minimum_cost(String[] nodes, int[] cost) {
		int[] groups = new int[cost.length];
		Edge[] edges = new Edge[cost.length];
		int k = 0;
		for (int i = 0; i < nodes.length; i++) {
			for (int j = i + 1; j < nodes.length; j++) {
				Krushkal Krushkal = new Krushkal();
				edges[k++] = Krushkal.new Edge(nodes[i] + "->" + nodes[j],
						cost[k - 1], nodes[i], nodes[j]);
				map.put(nodes[i], i + "");
				map.put(nodes[j], j + "");
			}
		}

		Arrays.sort(edges);
		int finalGroup = edges.length + 1;
		for (Edge node : edges) {
			if (!map.get(node.groupA).equals(map.get(node.groupB))) {

				map.put(node.groupB, finalGroup + "");
				map.put(node.groupA, finalGroup + "");
				optimalCost += node.cost;
				Krushkal.nodes.add(node);
			}
		}
		return optimalCost;
	}

}
