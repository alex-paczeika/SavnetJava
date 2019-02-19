
public class TestEA6 {
	public static void main(String[] args) {
		intToArray(345);
		int[] newarray = intToArray(345);
		for (int i = 0; i < newarray.length; i++) {
			System.out.println(newarray[i]);
		}

	}

	public static int[] intToArray(int n) {

		int nr = Integer.toString(n).length();

		int[] array = new int[nr];

		int i = 0;
		while (n != 0) {
			array[i] = n % 10;
			n = n / 10;

			i++;
		}
		for (i = 0; i < array.length / 2; i++) {
			int temp = array[i];
			array[i] = array[array.length - i - 1];
			array[array.length - i - 1] = temp;
		}
		return array;
	}
}
