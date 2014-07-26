package math.matrices;

import math.vectors.Vector3D;

public class Matrix3D extends Matrix {

	public Matrix3D() {
		super(3, 3);
	}

	public Vector3D mult(Vector3D vec) {
		
		Vector3D v1 = new Vector3D(m[0][0], m[0][1], m[0][2]);
		double x = v1.dot(vec);
		
		v1.x(m[1][0]);
		v1.y(m[1][1]);
		v1.z(m[1][2]);
		double y = v1.dot(vec);
		
		v1.x(m[2][0]);
		v1.y(m[2][1]);
		v1.z(m[2][2]);
		double z = v1.dot(vec);
		
		v1.x(x);
		v1.y(y);
		v1.z(z);
		return v1;
	}
	
}
