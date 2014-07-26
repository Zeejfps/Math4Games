

import math.matrices.Matrix2D;
import math.vectors.Vector2D;

public class Test {

	public static void main(String[] args) {

		Matrix2D m2 = new Matrix2D();
		m2.loadIdentity();
		m2.m[0][1] = 1;
		System.out.println(m2);

		m2.mult(2);
		System.out.println(m2);
		m2.mult(m2);
		System.out.println(m2);

		m2.mult(5).add(2);
		
		Vector2D vec = new Vector2D();
		vec.add(2).add(3);
	
	}
	
}
