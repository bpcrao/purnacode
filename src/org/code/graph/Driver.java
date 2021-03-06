/**
 * 
 */
package org.code.graph;

import java.io.IOException;

/**
 * @author Purna
 * 
 */
public class Driver {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		Graph graph = GraphBuilder.buildGraph();
		DepthFirstSearch dfs = new DepthFirstSearch(graph, 0);
		System.out.println(dfs.pathTo(3));
		
		BreadthFirstSearch bfs = new BreadthFirstSearch(graph, 0);
		System.out.println(bfs);
		System.out.println(bfs.pathTo(3));

	}
}
