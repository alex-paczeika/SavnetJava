import java.util.ArrayList;
import java.util.Arrays;

public class TestEA17 {

	public static void main(String[] args) {

		System.out.println(Arrays.toString(removeDuplicates(new int[] { 1, 3, 2, 2, 2, 3, 3, 3, 3 })));

	}

	public static int[] removeDuplicates(int[] arr) {
		int[] testarray = new int[] {};
		if (arr.length == 0)
			return testarray;

		Arrays.sort(arr);

		ArrayList<Integer> array = new ArrayList<Integer>();
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				array.add(arr[i]);
			}
		}
		array.add(arr[arr.length - 1]);

		int[] newarray = new int[array.size()];

		for (int i = 0; i < array.size(); i++) {
			newarray[i] = array.get(i);
		}

		return newarray;
	}
}
