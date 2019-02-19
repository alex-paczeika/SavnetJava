public class TestBA4 {
    public static void main(String[] args) {
        System.out.println(max(new int[]{3,4,5}));
    }
    public static int max(int[] sir) {
        int max= Integer.MIN_VALUE;
        for( int i=0; i< sir.length; i++)
        {
            if(sir[i] > max)
                max = sir[i];

        }
        return max;
    }
}
