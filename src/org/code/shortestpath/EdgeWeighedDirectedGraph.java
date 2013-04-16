/**
 * 
 */
package org.code.shortestpath;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Purna
 * 
 */
public class EdgeWeighedDirectedGraph {

	int numberofVertices;
	List<DirectedEdge>[] adjacent;

	/**
	 * 
	 */
	public EdgeWeighedDirectedGraph(int vertices) {
		numberofVertices = vertices;
		adjacent = new ArrayList[vertices];
		for (int index = 0; index < adjacent.length; index++) {
			adjacent[index] = new ArrayList<DirectedEdge>();
		}
	}

	/**
	 * add an edge between two vertices
	 * 
	 */
	void addEdge(DirectedEdge edge) {
		adjacent[edge.from].add(edge);
	}

	/**
	 * gets all vertices adjacent to V
	 * 
	 * @param v
	 * @return
	 */
	List<DirectedEdge> adjacent(int v) {
		return adjacent[v];
	}

	int verticesCount() {
		return numberofVertices;

	}

	int edgesCount() {
		return 0;

	}
}
