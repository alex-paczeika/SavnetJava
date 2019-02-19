import java.sql.Array;
import java.util.ArrayList;

public class TestEA9 {

    public static void main(String[] args) {
        System.out.println(countPairs(new int[]{1, 2, 3, 5, 7, 8, 9, 10, 11, 12}, 10));
    }

    public static int countPairs(int[] arr, int n) {
        int adunat = 0;
        int nr = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] != arr[j]) {
                    adunat = arr[i] + arr[j];
                    if (adunat == n) {
                        nr++;
                    }
                }

            }
            adunat = 0;
        }
        return nr;
    }

}
