package math.vectors;

public class Vector4D extends Vector<Vector4D> {

	public Vector4D() {
		super(4, Vector4D.class);
	}
	
	public Vector4D(double x, double y, double z, double w) {
		this();
		x(x); y(y); z(z); w(w);
	}

	public Vector4D(Vector3D vec) {
		this(vec.x(), vec.y(), vec.z(), 1);
	}
	
	public double x() {
		return components[X];
	}
	
	public double y() {
		return components[Y];
	}
	
	public double z() {
		return components[Z];
	}
	
	public double w() {
		return components[W];
	}
	
	public void x(double value) {
		components[X] = value;
	}
	
	public void y(double value) {
		components[Y] = value;
	}
	
	public void z(double value) {
		components[Z] = value;
	}
	
	public void w(double value) {
		components[W] = value;
	}
	
}
