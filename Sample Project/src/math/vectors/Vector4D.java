package math.vectors;

public class Vector4D extends Vector3D {

	public Vector4D() {
		this(0, 0, 0, 1);
	}
	
	public Vector4D(double x, double y, double z, double w) {
		this(new double[] {x, y, z, w});
	}
	
	public Vector4D(Vector4D copy) {
		this(copy.x(), copy.y(), copy.z(), copy.w());
	}
	
	public Vector4D(Vector3D vec) {
		this(vec.x(), vec.y(), vec.z(), 1);
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
