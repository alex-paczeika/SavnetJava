import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestEA12 {

	public static void main(String[] args) {
		int[] vectoru = new int[] { 5, 8, 11, 3, 6 };
		int[] rezultatul = removePosition(vectoru, 5);
		System.out.println(Arrays.toString(rezultatul));
	}

	public static int[] removePosition(int[] arr, int pos) {

		if ((pos < 0) || (pos > arr.length - 1))
			return null;

		List<Integer> newarray = new ArrayList<Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (i != pos)
				newarray.add(arr[i]);
		}

		int[] truearray = new int[newarray.size()];
		for (int i = 0; i < newarray.size(); i++) {
			truearray[i] = newarray.get(i);
		}

		return truearray;
	}
}
