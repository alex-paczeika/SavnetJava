public class TestEA4 {

    public static void main(String[] args) {

    }
    public static int cmmmc(int a, int b)
    {
        int x=a;
        int y=b;
        while (a!=b)
        {
            if (a>b)
                a=a-b;
            else
                b=b-a;
        }
      return ((x*y)/a);
    }

}
