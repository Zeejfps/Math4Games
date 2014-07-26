package math.matrices;

import math.vectors.Vector3D;
import math.vectors.Vector4D;

public class Matrix4D extends Matrix {

	public Matrix4D() {
		super(4, 4);
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
		
		double w = m[3][0] * vec.x() + m[3][1] * vec.y() + m[3][2] * vec.z() + m[3][3];
		
		v1.x(x);
		v1.y(y);
		v1.z(z);
		
		if (w != 1) v1.div(w);
		return v1;
	}
	
	public Vector4D mult(Vector4D vec) {
		
		Vector4D v1 = new Vector4D(m[0][0], m[0][1], m[0][2], m[0][3]);
		double x = v1.dot(vec);
		
		v1.x(m[1][0]);
		v1.y(m[1][1]);
		v1.z(m[1][2]);
		v1.w(m[1][3]);
		double y = v1.dot(vec);
		
		v1.x(m[2][0]);
		v1.y(m[2][1]);
		v1.z(m[2][2]);
		v1.w(m[2][3]);
		double z = v1.dot(vec);
		
		v1.x(m[3][0]);
		v1.y(m[3][1]);
		v1.z(m[3][2]);
		v1.w(m[3][3]);
		double w = v1.dot(vec);
		
		v1.x(x);
		v1.y(y);
		v1.z(z);
		v1.w(w);
		
		return v1;
	}
	
}
