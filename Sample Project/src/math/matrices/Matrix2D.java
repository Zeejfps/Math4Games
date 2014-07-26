package math.matrices;

import math.vectors.Vector2D;

public class Matrix2D extends Matrix {

	public Matrix2D() {
		this(2, 2);
	}
	
	protected Matrix2D(int rows, int cols) {
		super(rows, cols);
	}
	
	public Vector2D mult(Vector2D vec) {
		
		Vector2D v1 = new Vector2D(m[0][0], m[0][1]);
		
		double x = v1.dot(vec);
		v1.x(m[1][0]);
		v1.y(m[1][1]);
		
		double y = v1.dot(vec);
		v1.x(x);
		v1.y(y);
		
		return v1;
	}
	
	public Matrix2D mult(Matrix2D mat) {
		Vector2D v1 = mult(new Vector2D(mat.m[0][0], mat.m[1][0]));
		Vector2D v2 = mult(new Vector2D(mat.m[0][1], mat.m[1][1]));
		
		m[0][0] = v1.x(); m[0][1] = v2.x();
		m[1][0] = v1.y(); m[1][1] = v2.y();
		
		return this;
	}
	
}
