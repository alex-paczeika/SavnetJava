public class TestBA5 {
    public static void main(String[] args) {
        System.out.println(product(new int[]{3,4,0}));
    }
    public static int product(int[] sir) {
        int produs=1;
        for (int i=0; i< sir.length ; i++)
        {
            if(sir[i] != 0)
                produs = produs * sir[i];
        }
        return  produs;
    }
}
