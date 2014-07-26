package math.vectors;

public class Vector2D extends Vector {
	
	public Vector2D() {
		this(0, 0);
	}
	
	public Vector2D(double x, double y) {
		this(new double[]{x, y});
	}
	
	public Vector2D(Vector2D copy) {
		this(copy.x(), copy.y());
	}
	
	protected Vector2D(double[] components) {
		super(components);
	}
	
	public double x() {
		return components[X];
	}
	
	public void x(double value) {
		this.components[X] = value;
	}
	
	public double y() {
		return components[Y];
	}
	
	public void y(double value) {
		this.components[Y] = value;
	}
	
}
