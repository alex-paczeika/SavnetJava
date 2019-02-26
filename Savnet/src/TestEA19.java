import java.util.Arrays;

public class TestEA19 {
	public static void main(String[] args) {
		System.out.println(isSudokuLine(new int[] { 1, 5, 0, 0, 5, 6, 7, 7, 0 }));
	}

	public static boolean isSudokuLine(int[] arr) {

		if (arr.length != 9) {
			return false;
		}
		Arrays.sort(arr);

		int duplicate = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1]) {

				if ((arr[i] != 0) || arr[i + 1] != 0) {

					duplicate++;
				}
			}
		}

		if (duplicate == 0) {
			return true;
		}
		return false;
	}

}
