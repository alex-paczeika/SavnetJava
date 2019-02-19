public class TestBA6 {
    public static void main(String[] args) {
        System.out.println(arrayToNumber(new int[]{3, 1, 5}));
    }

    public static int arrayToNumber(int[] sir) {
        int nr= 0;
        Integer numarul = 0;
        if(sir.length == 0)
            return  -1;
        else
            for (int i=0 ; i<sir.length; i++)
                if(sir[i]<0 || sir[i] > 9) {
                    nr++;
                }
                else
                    numarul = Integer.valueOf(String.valueOf(numarul) +String.valueOf(sir[i]) );
        if (nr!=0)
            return -2;
        else
            return numarul;
    }
}

