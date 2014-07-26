package math.vectors;

public class Vector {
	
	protected static final int X = 0, Y = 1, Z = 2, W = 3;
	
	public final double[] components;
	public final int dimension;
	
	public Vector(double... components) {
		this.components = components;
		this.dimension = components.length;
	}
	
	public Vector add(Vector vec) {
		for (int i = 0; i < dimension && i < vec.dimension; i++) {
			components[i] += vec.components[i];
		}
		return this;
	}
	
	public Vector add(double value) {
		for (int i = 0; i < dimension; i++) {
			components[i] += value;
		}
		return this;
	}
	
	public Vector sub(Vector vec) {
		for (int i = 0; i < dimension && i < vec.dimension; i++) {
			components[i] -= vec.components[i];
		}
		return this;
	}
	
	public Vector sub(double value) {
		for (int i = 0; i < dimension; i++) {
			components[i] -= value;
		}
		return this;
	}
	
	public Vector mult(double value) {
		for (int i = 0; i < dimension; i++) {
			components[i] *= value;
		}
		return this;
	}
	
	public Vector div(double value) {
		for (int i = 0; i < dimension; i++) {
			components[i] /= value;
		}
		return this;
	}
	
	public double dot(Vector vec) {
		double result = 0;
		for (int i = 0; i < dimension && i < vec.dimension; i++) {
			result += components[i] * vec.components[i];
		}
		return result;
	}
	
	public double magnitude() {
		double total = 0;
        for (int i = 0; i < dimension; i++) {
            total += components[i];
        }

        return Math.sqrt(total);
	}
	
	public void normalize() {
		double mag = magnitude();
        div(mag);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Vector").append(dimension).append("D: [");
		for (int i = 0; i < dimension-1; i++) {
			sb.append(components[i]).append(", ");
		}
		sb.append(components[dimension-1]).append("]");
		return sb.toString();
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if (obj instanceof Vector) {
			Vector vec = (Vector)obj;
			if (dimension == vec.dimension) {
				for (int i = 0; i < dimension; i++) {
					if (components[i] != vec.components[i]) {
						return false;
					}
				}
				return true;
			}
		}
		
		return false;
	}
	
}

