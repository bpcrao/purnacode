/**
 * 
 */
package org.code.shortestpath;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import org.code.graph.directional.DirectionalGraph;

/**
 * @author Purna
 * 
 */
public class GraphBuilder {

	/**
	 * 
	 */
	public GraphBuilder() {
		// TODO Auto-generated constructor stub
	}

	public static EdgeWeighedDirectedGraph buildGraph()
			throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(
				new InputStreamReader(
						new FileInputStream(
								"E:\\EclipseWorkSpace\\purnacode\\src\\org\\code\\shortestpath\\input.txt")));
		int vertices = Integer.parseInt(reader.readLine());
		int edges = Integer.parseInt(reader.readLine());
		String line;

		EdgeWeighedDirectedGraph graph = new EdgeWeighedDirectedGraph(vertices);

		while ((line = reader.readLine()) != null && !line.isEmpty()) {
			System.out.println(line);
			DirectedEdge directedEdge = new DirectedEdge(Integer.parseInt(line
					.split(" ")[0]), Integer.parseInt(line.split(" ")[1]),
					Double.valueOf((line.split(" ")[2])));
			graph.addEdge(directedEdge);
		}
		return graph;
	}
}
