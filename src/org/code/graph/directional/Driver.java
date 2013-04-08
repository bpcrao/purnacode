/**
 * 
 */
package org.code.graph.directional;

import java.io.IOException;
import java.util.Stack;

/**
 * @author Purna
 * 
 */
public class Driver {

	/**
	 * 
	 */
	public Driver() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		DirectionalGraph graph = GraphBuilder.buildGraph();
		BreadthFirstSearch dfs = new BreadthFirstSearch(graph, 4);
		System.out.println(dfs.hasPath(3));
		Stack<Integer> path = dfs.pathTo(3);
		while (!path.isEmpty()) {
			System.out.print(path.pop() + " => ");
		}

	}
}
