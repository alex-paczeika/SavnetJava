public class TestBA2 {
    public static void main(String[] args) {
        System.out.println(countNegatives(new int[]{3,-4,-5}));
    }
    public static int countNegatives(int[] sir)
    {
        int negative=0;
        for(int i =0 ; i< sir.length ; i++)
        {
            if (sir[i] < 0)
                negative++;
        }
        return negative;
    }
}
