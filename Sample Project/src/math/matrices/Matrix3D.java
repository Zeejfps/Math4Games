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
	
	public Matrix3D mult(Matrix3D mat) {
		Vector3D v1 = mult(new Vector3D(mat.m[0][0], mat.m[1][0], mat.m[2][0]));
		Vector3D v2 = mult(new Vector3D(mat.m[0][1], mat.m[1][1], mat.m[2][1]));
		Vector3D v3 = mult(new Vector3D(mat.m[0][2], mat.m[1][2], mat.m[2][2]));
		
		m[0][0] = v1.x(); m[0][1] = v2.x(); m[0][2] = v3.x();
		m[1][0] = v1.y(); m[1][1] = v2.y(); m[1][2] = v3.y();
		m[2][0] = v1.z(); m[2][1] = v2.z(); m[2][2] = v3.z();
		
		return this;
	}
	
}
