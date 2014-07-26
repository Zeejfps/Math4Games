package math;

import math.matrices.*;
import math.vectors.*;

public class Test {

	public static void main(String[] args) {
		
		Vector2D v2 = new Vector2D(2, 2);
		System.out.println(v2);
		
		Matrix2D m2 = new Matrix2D();
		m2.loadIdentity();
		m2.add(2);
		System.out.println(m2);

		System.out.println(m2.mult(v2));
		
		Matrix3D m3 = new Matrix3D();
		System.out.println(m3);
		System.out.println(m3.mult(new Vector3D(1, 0, 5)));
	
	}
	
}
