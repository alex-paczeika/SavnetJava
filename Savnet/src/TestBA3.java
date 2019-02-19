public class TestBA3 {
    public static void main(String[] args) {
        System.out.println(factorial(0));
    }

    public static int factorial(int n) {
        int sum = 1;
        if (n > 1) {

            for (int i = 1; i <= n; i++) {
                sum = sum * i;
            }
        }
        return sum;
    }
}

