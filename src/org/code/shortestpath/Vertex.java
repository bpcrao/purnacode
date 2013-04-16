/**
 * 
 */
package org.code.shortestpath;

/**
 * @author Purna
 * 
 */
public class Vertex implements Comparable<Vertex> {

	int vertex;
	double distanceTo;

	/**
	 * @param d
	 * @param source
	 * 
	 */
	public Vertex(int source, double d) {
		// TODO Auto-generated constructor stub
		this.vertex = source;
		this.distanceTo = d;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Vertex that) {
		if (this.distanceTo > that.distanceTo)
			return 1;
		else if (this.distanceTo < that.distanceTo)
			return -1;
		return 0;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + vertex;
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vertex other = (Vertex) obj;
		if (vertex != other.vertex)
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Vertex [vertex=" + vertex + ", distanceTo=" + distanceTo + "]";
	}

	

}
