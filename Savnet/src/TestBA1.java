import java.util.Arrays;

public class TestBA1 {

    public static void main(String[] args) {
        System.out.println(avg(new int[]{3, 5, 5}));
    }
    public static double avg(int[] sir) {
        double sum = 0;
        for (int i =0 ; i< sir.length; i++)
        {
         sum = sum + sir[i];
        }

        return (sum/sir.length);
    }
}
