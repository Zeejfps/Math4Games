package math.matrices;

class Matrix {

	public final double[][] m;
	public final int rows, cols;
	
	public Matrix(int rows, int cols) {
		this.rows = rows;
		this.cols = cols;
		m = new double[rows][cols];
	}
	
	public void loadIdentity() {
		for (int i = 0; i < rows; i++) {
			
			for (int j = 0; j < cols; j++) {
				
				if(i == j) {
					m[i][j] = 1;
				}
				
			}

		}
		
	}
	
	public Matrix add(double value) {
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				m[i][j] += value;
			}
		}
		return this;
	}
	
	public Matrix mult(double value) {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				m[i][j] *= value;
			}
		}
		return this;
	}
	
	public Matrix sub(double value) {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				m[i][j] -= value;
			}
		}
		return this;
	}
	
	public Matrix div(double value) {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				m[i][j] /= value;
			}
		}
		return this;
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append("Matrix ").append(rows).append("x").append(cols).append(":");
		
		for (int i = 0; i < rows; i++) {
			
			sb.append("\n[");
			for (int j = 0; j < cols-1; j ++) {
				sb.append(m[i][j]).append(", ");
			}
			sb.append(m[i][cols-1]).append("]");
		}
		
		return sb.toString();
	}
	
	@Override
	public boolean equals(Object obj) {
	
		if (obj instanceof Matrix) {
			
			Matrix mat = (Matrix)obj;
			if (mat.rows == rows && mat.cols == cols) {
				
				for (int i = 0; i < rows; i ++) {
					for (int j = 0; j < cols; j++) {
						
						if (m[i][j] != mat.m[i][j])
							return false;
						
					}
					
				}
				
				return true;
			}
			
		}
		
		return false;
	}
	
}
