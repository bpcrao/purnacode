package org.code.graph.directional;

import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.ConcurrentLinkedQueue;

public class BreadthFirstSearch {
	boolean[] visited;
	int[] edgeTO;
	int[] distTO;
	private int srcVtx;

	/**
	 * @param graph
	 * @param vertex
	 */
	public BreadthFirstSearch(DirectionalGraph graph, int vertex) {
		this.srcVtx = vertex;
		edgeTO = new int[graph.verticesCount()];
		distTO = new int[graph.verticesCount()];
		visited = new boolean[graph.verticesCount()];
		bfs(graph, vertex);
	}

	/**
	 * @param graph
	 * @param vertex
	 */
	private void bfs(DirectionalGraph graph, int vertex) {

		Queue<Integer> vertexQueue = new ConcurrentLinkedQueue<>();
		visited[vertex] = true;
		vertexQueue.add(vertex);
		int distance = 0;

		while (!vertexQueue.isEmpty()) {
			int currentVtx = vertexQueue.remove();

			List<Integer> adjacent = graph.adjacent(currentVtx);

			++distance;
			for (Integer integer : adjacent) {
				if (!visited[integer]) {
					visited[integer] = true;

					edgeTO[integer] = currentVtx;
					System.out.println(currentVtx + "=>" + integer);
					distTO[integer] = distance;
					vertexQueue.add(new Integer(integer));
				}
			}

		}
	}

	/**
	 * @param i
	 * @return
	 */
	public Stack<Integer> pathTo(int i) {
		Stack<Integer> path = new Stack<Integer>();
		if (hasPath(i)) {
			System.out.println(edgeTO[i]);
			while (i != srcVtx) {
				path.add(edgeTO[i]);				
				if (edgeTO[i] == i) {					
					break;
				}
				i = edgeTO[i];
			}

		}
		return path;
	}

	public boolean hasPath(int i) {
		return visited[i];
	}

}
