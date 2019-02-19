import java.util.ArrayList;

public class TestEA17 {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3 };
		removeDuplicates(arr);
	}

	public static int[] removeDuplicates(int[] arr) {
		int[] testarray = new int[] {};
		if (arr.length == 0)
			return testarray;

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
