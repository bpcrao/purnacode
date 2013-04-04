/**
 * 
 */
package org.code.graph;

import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * @author Purna
 * 
 */
public class BreadthFirstSearch {

	boolean[] visited;
	int[] edgeTO;
	int[] distTO;
	private int srcVtx;

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BreadthFirstSearch [visited=" + Arrays.toString(visited)
				+ ", edgeTO=" + Arrays.toString(edgeTO) + ", distTO="
				+ Arrays.toString(distTO) + ", srcVtx=" + srcVtx + "]";
	}

	/**
	 * @param graph
	 * @param i
	 */
	public BreadthFirstSearch(Graph graph, int src) {
		this.srcVtx = src;
		visited = new boolean[graph.verticesCount()];
		edgeTO = new int[graph.verticesCount()];
		distTO = new int[graph.verticesCount()];
		bfs(graph, src);
	}

	/**
	 * @param graph
	 * @param src
	 */
	private void bfs(Graph graph, int src) {
		Queue<Integer> que = new ConcurrentLinkedQueue<Integer>();
		que.add(new Integer(src));
		visited[src] = true;
		distTO[src] = 0;
		while (!que.isEmpty()) {
			Integer vertex = que.remove();
			for (Integer integer : graph.adjacent(vertex.intValue())) {
				if (!visited[integer]) {
					visited[integer] = true;
					edgeTO[integer] = vertex;
					que.add(integer);
					distTO[integer] = distTO[vertex] + 1;
				}
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
