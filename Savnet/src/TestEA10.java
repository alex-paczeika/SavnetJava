public class TestEA10 {
    public static void main(String[] args) {
        System.out.println(fibo(0));
    }
    public static int fibo(int n) {
        if (n<0)
            return -1;
        if (n==0)
            return 0;
        if (n==1)
            return 1;
            int s=0;
        int[] arr = new int[n*100];

        arr[0]=0;
        arr[1]=1;
        for(int i= 2; i<= n ;i++)
        {
            arr[i] = arr[i-1] + arr[i-2];
            if(i==n)
                s=arr[i];
        }


return s;
    }
}
