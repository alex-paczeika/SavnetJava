
public class TestEA15 {
	public static void main(String[] args) {

	}

	public static int[][] getMatrixProduct(int[][] matrix1, int[][] matrix2) {
		int[][] produs = new int[matrix1.length][matrix1.length];
		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1.length; j++) {
				for (int k = 0; k < matrix2.length; k++) {
					produs[i][j] += matrix1[i][k] * matrix2[k][j];
				}
			}
		}

		return produs;

	}
}
