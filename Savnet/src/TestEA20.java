import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestEA20 {

    public static void main(String[] args) {

        System.out.println(sudokuChecker(new int[][]{{0,0,0} ,{0,0,0}, {0,4,0},{1,2,3}}));

    }

    public static boolean sudokuChecker(int[][] matrix) {


        ArrayList<Integer> list = new ArrayList<Integer>();

        for( int i=0 ; i< matrix.length ; i++)
        {
            for(int j = 0 ; j<matrix[0].length; j++)
            {
                list.add(matrix[i][j]);
                if(matrix[i][j] > 9 || matrix[i][j] < 0 )
                {
                    return false;
                }
            }
        }

        Collections.sort(list);

        if(list.size() != 9)
        {
            return  false;
        }

        for (int i = 0; i < list.size() - 1; i++)
        {
            if ((list.get(i) == list.get(i+1)) && (list.get(i) != 0 ))
            {
                return false;
            }

        }



        return true;
    }

}
