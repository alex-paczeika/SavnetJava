public class TestEA2 {
    public static void main(String[] args) {

    }

    public static boolean isPalindrome(int n) {
        int palindrom = n;
        int reverse = 0;
        while (palindrom != 0) {
            int remainder = palindrom % 10;
            reverse = reverse * 10 + remainder;
            palindrom = palindrom / 10;
        }


        return n == reverse;

    }
}
