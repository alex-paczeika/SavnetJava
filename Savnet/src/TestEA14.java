
public class TestEA14 {
	public static void main(String[] args) {

	}

	public static int[][] getMatrixSum(int[][] matrix1, int[][] matrix2) {
		int[][] matrixSum = new int[matrix1.length][matrix1.length];
		for (int i = 0; i < matrix1.length; i++) {

			for (int j = 0; j < matrix1.length; j++) {
				matrixSum[i][j] = matrix1[i][j] + matrix2[i][j];

			}

		}
		return matrixSum;
	}

}
