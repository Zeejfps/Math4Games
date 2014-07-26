package math.vectors;

class Vector <V extends Vector<V>> {

	protected static final int X = 0, Y = 1, Z = 2, W = 3;
	
	protected double[] components;
	protected int dimension;
	private final Class<V> clazz;
	
	public Vector(int dimension, Class<V> clazz) {
		this.dimension = dimension;
		this.components = new double[dimension];
		this.clazz = clazz;
	}
	
	@SuppressWarnings("unchecked")
	public V add(V vec) {
		
		for (int i = 0; i < dimension; i++) {
			components[i] += vec.components[i];
		}
		
		return (V)this;
	}

	@SuppressWarnings("unchecked")
	public V add(double value) {
		
		for (int i = 0; i < dimension; i++) {
			components[i] += value;
		}
		
		return (V)this;
	}
	
	@SuppressWarnings("unchecked")
	public V sub(V vec) {
		
		for (int i = 0; i < dimension; i++) {
			components[i] -= vec.components[i];
		}
		
		return (V)this;
	}

	@SuppressWarnings("unchecked")
	public V sub(double value) {
		
		for (int i = 0; i < dimension; i++) {
			components[i] -= value;
		}
		
		return (V)this;
	}
	
	@SuppressWarnings("unchecked")
	public V mult(double value) {
		
		for (int i = 0; i < dimension; i++) {
			components[i] *= value;
		}
		
		return (V)this;
	}
	
	@SuppressWarnings("unchecked")
	public V div(double value) {
		
		for (int i = 0; i < dimension; i++) {
			components[i] /= value;
		}
		
		return (V)this;
	}
	
	public double magnitude() {
		double total = 0;
        for (int i = 0; i < dimension; i++) {
            total += components[i];
        }

        return Math.sqrt(total);
	}
	
	public double dot(V vec) {
		double result = 0;
		for (int i = 0; i < dimension && i < vec.dimension; i++) {
			result += components[i] * vec.components[i];
		}
		return result;
	}
	
	public void normalize() {
		double mag = magnitude();
        div(mag);
	}
	
	@Override
	public V clone() {
		try {
			V vec = clazz.newInstance();
			vec.components = components.clone();
			return vec;
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
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
			@SuppressWarnings("unchecked")
			Vector<V> vec = (Vector<V>)obj;
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
	
	public static<V extends Vector<V>> V add(V v1, V v2) {
		V result = v1.clone();
		result.add(v2);
		
		return result;
	}
	
	public static<V extends Vector<V>> V add(V v1, double value) {
		V result = v1.clone();
		result.add(value);
		
		return result;
	}
	
	public static<V extends Vector<V>> V sub(V v1, V v2) {
		V result = v1.clone();
		result.sub(v2);
		
		return result;
	}
	
	public static<V extends Vector<V>> V sub(V v1, double value) {
		V result = v1.clone();
		result.sub(value);
		
		return result;
	}
	
	
	public static<V extends Vector<V>> V mult(V v1, double value) {
		V result = v1.clone();
		result.mult(value);
		
		return result;
	}
	
	public static<V extends Vector<V>> V div(V v1, double value) {
		V result = v1.clone();
		result.div(value);
		
		return result;
	}
	
}
