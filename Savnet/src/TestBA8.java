public class TestBA8 {
    public static void main(String[] args) {
     int[] inversat = reverse(new int[]{3,4,5});
     for (int i=0;i< inversat.length ; i++ )
     {
         System.out.println(inversat[i]);
     }

    }
    public static int[] reverse(int[] sir)
    {
        int temp;
        for (int i = 0; i < sir.length / 2; i++) {
         temp = sir[i];
       sir[i] = sir[sir.length - 1 - i];
       sir[sir.length - 1 - i] = temp;
    }
    return sir;

    }
}
