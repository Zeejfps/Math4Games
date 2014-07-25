package math.vectors;

import java.util.Arrays;

public class Vector2D extends Vector {

	private final static int X = 0, Y = 1;
	
	public Vector2D() {
		this(0, 0);
	}
	
	public Vector2D(double x, double y) {
		super(new double[]{x, y});
	}
	
	public Vector2D(Vector2D copy) {
		this(Arrays.copyOf(copy.components, copy.dimension));
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
