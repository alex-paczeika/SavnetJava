
public class TestEA18 {
	public static void main(String[] args) {
		System.out.println(countSums(new int[] { 6, 7, 8 }));

	}

	public static int countSums(int[] arr) {
		if (arr.length == 0)
			return 0;
		int nr = 0;
		for (int i = arr.length - 1; i > 0; i--) {
			int j = 0;
			if (i != 1) {
				while (arr[i] != 0) {
					if (arr[i - 1] + arr[j] == arr[i]) {
						arr[i] = 0;
						nr++;
						System.out.println(arr[i - 1]);
						System.out.println(arr[j]);
					}
					j++;
					if (j == arr.length - 1)
						return 0;
					j++;
				}
			}
		}
		return nr;
	}

}
