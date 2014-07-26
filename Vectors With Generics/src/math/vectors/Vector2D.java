package math.vectors;

public class Vector2D extends Vector<Vector2D> {

	public Vector2D() {
		super(2, Vector2D.class);
	}
	
	public Vector2D(double x, double y) {
		this();
		x(x); y(y);
	}
	
	public double x() {
		return components[X];
	}
	
	public double y() {
		return components[Y];
	}
	
	public void x(double value) {
		components[X] = value;
	}
	
	public void y(double value) {
		components[Y] = value;
	}
	
}
