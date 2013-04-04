/**
 * 
 */
package org.code.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Purna
 * 
 */
public class Graph {

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Graph [numberofVertices=" + numberofVertices + ", bags="
				+ Arrays.toString(adjacent) + "]";
	}

	int numberofVertices;
	List<Integer>[] adjacent;

	Graph(int vertices) {
		numberofVertices = vertices;
		adjacent = new ArrayList[vertices];
		for (int index = 0; index < adjacent.length; index++) {
			adjacent[index] = new ArrayList();
		}
	}

	/**
	 * 
	 */
	public Graph() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * add an edge between two vertices
	 * 
	 * @param vertexA
	 * @param vertexB
	 */
	void addEdge(int vertexA, int vertexB) {
		adjacent[vertexA].add(vertexB);
		adjacent[vertexB].add(vertexA);
	}

	/**
	 * gets all vertices adjacent to V
	 * 
	 * @param v
	 * @return
	 */
	List<Integer> adjacent(int v) {
		return adjacent[v];
	}

	int verticesCount() {
		return numberofVertices;

	}

	int edgesCount() {
		return 0;

	}
}
