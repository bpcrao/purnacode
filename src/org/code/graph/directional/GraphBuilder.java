/**
 * 
 */
package org.code.graph.directional;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Purna
 * 
 */
public class GraphBuilder {

	public static DirectionalGraph buildGraph() throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(
				new InputStreamReader(
						new FileInputStream(
								"E:\\EclipseWorkSpace\\purnacode\\src\\org\\code\\graph\\directional\\input.txt")));
		int vertices = Integer.parseInt(reader.readLine());
		int edges = Integer.parseInt(reader.readLine());
		String line;

		DirectionalGraph fraph = new DirectionalGraph(vertices);

		while ((line = reader.readLine()) != null && !line.isEmpty()) {
			System.out.println(line);
			fraph.addEdge(Integer.parseInt(line.split(" ")[0]),
					Integer.parseInt(line.split(" ")[1]));
		}
		return fraph;
	}
}
