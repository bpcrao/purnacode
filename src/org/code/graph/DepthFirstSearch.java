/**
 * 
 */
package org.code.graph;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * @author Purna
 * 
 */
public class DepthFirstSearch {

	boolean[] visited;
	int[] edgeTO;
	private int srcVtx;

	/**
	 * @param graph
	 * @param sourceVertex
	 */
	public DepthFirstSearch(Graph graph, int sourceVertex) {
		this.srcVtx = sourceVertex;
		visited = new boolean[graph.verticesCount()];
		edgeTO = new int[graph.verticesCount()];
		depthSearch(graph, sourceVertex);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DepthFirstSearch [visited=" + Arrays.toString(visited)
				+ ", edgeTO=" + Arrays.toString(edgeTO) + "]";
	}

	/**
	 * @param graph
	 * @param sourceVertex
	 */
	private void depthSearch(Graph graph, int sourceVertex) {
		visited[sourceVertex] = true;
		List<Integer> adjVertices = graph.adjacent(sourceVertex);
		for (Integer vertex : adjVertices) {
			if (!visited[vertex]) {
				visited[vertex] = true;
				edgeTO[vertex] = sourceVertex;
				depthSearch(graph, vertex);
			}
		}
	}

	/**
	 * returns trud if there is a Path
	 * 
	 * @param v
	 * @return
	 */
	boolean hasPathTo(int v) {
		return visited[v];
	}

	/**
	 * returns the path from src to => V
	 * 
	 * @param v
	 * @return
	 */
	Iterable<Integer> pathTo(int v) {
		Stack<Integer> path = new Stack<Integer>();
		if (hasPathTo(v)) {
			for (int i = v; i != srcVtx; i = edgeTO[i]) {
				path.push(new Integer(i));
			}
			path.push(new Integer(srcVtx));
			return path;
		}

		return null;

	}

}
