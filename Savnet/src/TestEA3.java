public class TestEA3 {
    public static void main(String[] args) {

    }
    public static boolean isPrime(int n) {
        int nr=0;
        for (int i = 1; i<=n ; i++)
        {
            if (n%i == 0 )
            {
                nr++;
            }
        }
    return (nr == 2);
    }
}
