/**
 * 
 */
package org.code.shortestpath;

/**
 * @author Purna
 * 
 */
public class DirectedEdge {

	int from;
	int to;
	double weight;

	/**
	 * 
	 */
	public DirectedEdge(int from, int to, Double double1) {
		this.from = from;
		this.to = to;
		this.weight = double1;
	}

	int from() {
		return this.from;
	}

	int to() {
		return this.to;
	}

	double weight() {
		return this.weight;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DirectedEdge [from=" + from + ", to=" + to + ", weight="
				+ weight + ", toString()=" + super.toString() + "]";
	}

}
