public class TestEA11 {
    public static void main(String[] args) {
        System.out.println(isUnique(new int[]{1, 6, 98, 3, 4, 5}));
    }
    public static boolean isUnique(int[] arr) {
        int nr=0;
        for(int i =0; i< arr.length ; i++) {
            for (int j = i; j < arr.length; j++) {
                if (i != j) {
                    if (arr[i] == arr[j])
                        nr++;
                }
            }
        }
        if(nr>0)
            return  false;
        return true;

    }

}
