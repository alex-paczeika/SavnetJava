public class TestEA1 {

	public static void main(String[] args) {
		System.out.println(reverse(245));
	}

	public static int reverse(int n) {
		int reversed = 0;

		while (n != 0) {
			int digit = n % 10;
			reversed = reversed * 10 + digit;
			n /= 10;
		}
		return reversed;
	}
}