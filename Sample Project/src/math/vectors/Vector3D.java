package math.vectors;

public class Vector3D extends Vector2D {

	public Vector3D() {
		this(0, 0, 0);
	}
	
	public Vector3D(double x, double y, double z) {
		this(new double[]{x, y, z});
	}
	
	public Vector3D(Vector3D copy) {
		this(copy.x(), copy.y(), copy.z());
	}
	
	protected Vector3D(double[] components) {
		super(components);
	}
	
	public double z() {
		return components[Z];
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
