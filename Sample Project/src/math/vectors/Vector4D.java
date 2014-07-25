package math.vectors;

import java.util.Arrays;

public class Vector4D extends Vector3D {

	private final static int W = 3;
	
	public Vector4D() {
		this(0, 0, 0, 1);
	}
	
	public Vector4D(double x, double y, double z, double w) {
		super(new double[]{x, y, z, w});
	}
	
	public Vector4D(Vector4D copy) {
		this(Arrays.copyOf(copy.components, copy.dimension));
	}
	
	protected Vector4D(double[] components) {
		super(components);
	}
	
	public double w() {
		return components[W];
	}
	
	public void w(double value) {
		components[W] = value;
	}
	
}
