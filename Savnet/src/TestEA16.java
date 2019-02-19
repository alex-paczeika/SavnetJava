import java.util.ArrayList;
import java.util.Arrays;

public class TestEA16 {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 2, 3, 4, 1, 2, 4 };
		int[] brr = new int[] { 1, 2 };
		countAppearances(arr, brr);
	}

	public static int countAppearances(int[] a, int[] b) {
		Arrays.sort(a);
		ArrayList<Integer> array = new ArrayList<Integer>();
		int k = 0, nr = 0;
		for (int j = 0; j < b.length; j++) {
			for (int i = 0; i < a.length - 1; i++) {
				if (a[i] == a[i + 1]) {
					nr++;

				}
			}
			array.add(nr);
			k++;

		}

		System.out.println(Arrays.toString(array.toArray()));
		return 3;

	}
}
