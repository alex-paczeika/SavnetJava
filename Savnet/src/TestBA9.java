public class TestBA9 {
	public static void main(String[] args) {
		int[][] matrix = new int[][] { { 4, 6, 3 }, { 0, 2, 1 }, { 6, 8, 5 } };
		System.out.println(getDiagonalSum(matrix));
	}

	public static int getDiagonalSum(int[][] matrix) {
		int sum = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if (i == j) {
					sum = sum + matrix[i][j];
				}
			}
		}
		return sum;
	}
}