/**
 * 
 */
package org.code.shortestpath;

import java.io.IOException;


/**
 * @author Purna
 * 
 */
public class Driver {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		EdgeWeighedDirectedGraph graph = GraphBuilder.buildGraph();

		DijkstraSP dijkstraSP = new DijkstraSP(graph, 0);
		
		

		System.out.println(dijkstraSP);
	}

}
