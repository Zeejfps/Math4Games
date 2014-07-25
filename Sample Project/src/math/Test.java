package math;

import math.vectors.Vector;
import math.vectors.Vector2D;
import math.vectors.Vector4D;

public class Test {

	public static void main(String[] args) {
		
		Vector v1 = new Vector(2);
		System.out.println(v1);
		
		Vector2D v2 = new Vector2D(2, 2);
		System.out.println(v2);
	
		v1.add(10);
		System.out.println(v1);
		v1.add(v2).add(v1).add(50);
		System.out.println(v1);
		
		Vector copy = new Vector(v1);
		System.out.println(copy);
		
		v1.add(20);
		System.out.println(v1);
		System.out.println(copy);
	}
	
}
