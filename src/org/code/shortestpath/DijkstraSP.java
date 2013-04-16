/**
 * 
 */
package org.code.shortestpath;

import java.util.Arrays;
import java.util.List;

/**
 * @author Purna
 * 
 */
public class DijkstraSP {

	DirectedEdge[] edgeTO;
	Double[] distanceTO;
	PriorityQueue priorityQueue;

	/**
	 * 
	 */
	public DijkstraSP(EdgeWeighedDirectedGraph graph, int source) {
		edgeTO = new DirectedEdge[graph.verticesCount()];
		distanceTO = new Double[graph.verticesCount()];
		priorityQueue = new PriorityQueue();

		for (int i = 0; i < graph.verticesCount(); i++) {
			distanceTO[i] = Double.POSITIVE_INFINITY;
		}
		distanceTO[source] = 0.0;
		Vertex src = new Vertex(source, 0.0);
		priorityQueue.add(src);

		while (!priorityQueue.isEmpty()) {
			Vertex vertex = (Vertex) priorityQueue.remove();
			List<DirectedEdge> adjList = graph.adjacent((int) vertex.vertex);
			for (DirectedEdge directedEdge : adjList) {
				relaxEdge(directedEdge);
			}
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DijkstraSP [edgeTO=" + Arrays.toString(edgeTO)
				+ ", distanceTO=" + Arrays.toString(distanceTO)
				+ ", priorityQueue=" + priorityQueue + "]";
	}

	/**
	 * @param directedEdge
	 */
	private void relaxEdge(DirectedEdge directedEdge) {
		System.out.println("relax edfe "+directedEdge);
		int from = directedEdge.from();
		int to = directedEdge.to();

		if (distanceTO[to] > distanceTO[from] + directedEdge.weight) {
			distanceTO[to] = distanceTO[from] + directedEdge.weight;
			edgeTO[to] = directedEdge;
			Vertex vertex = new Vertex(to, distanceTO[to]);
			if (priorityQueue.contains(vertex)) {
				priorityQueue.update(vertex);
			} else {
				priorityQueue.add(vertex);

			}
		}

	}

}
