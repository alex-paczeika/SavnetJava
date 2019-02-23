public class TestEA16 {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 1, 2, 1, 2, 1, 1, 1 };
		int[] brr = new int[] { 1, 2, 1 };
		System.out.println(countAppearances(arr, brr));

	}

	public static int countAppearances(int[] a, int[] b) {
		int i = 0, j = 0, nr = 0;

		while (i < a.length && j < b.length) {
			if (a[i] == b[j]) {
				i++;
				j++;
				if (j == b.length) {
					nr++;
					if (b.length != 1) {
						i--;
					}
					j = 0;

				}
			} else {

				j = 0;
				if (a[i] != b[j])
					i++;
			}
		}
		return nr;
	}
}
