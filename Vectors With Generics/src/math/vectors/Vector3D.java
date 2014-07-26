package math.vectors;

public class Vector3D extends Vector<Vector3D> {

	public Vector3D() {
		super(3, Vector3D.class);
	}
	
	public Vector3D(double x, double y, double z) {
		this();
		x(x); y(y); z(z);
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
	
	public void x(double value) {
		components[X] = value;
	}
	
	public void y(double value) {
		components[Y] = value;
	}
	
	public void z(double value) {
		components[Z] = value;
	}
	
	public Vector3D cross(Vector3D vec) {
		
		double x = y()*vec.z() - z()*vec.y();
		double y = z()*vec.x() - x()*vec.z();
		double z = x()*vec.y() - y()*vec.x();
		
		return new Vector3D(x, y, z);
	}

}
