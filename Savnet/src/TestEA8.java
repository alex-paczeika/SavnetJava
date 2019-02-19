public class TestEA8 {

    public static void main(String[] args) {
        int[] t = new int[]{1, 2, 3, 4, 2, 1, 3, 4};
        int[] r = new int[]{2, 3, 4};
        System.out.println(contains(t, r));
    }

    public static boolean contains(int[] a, int[] b) {

        if (b.length == 0)
            return true;
        int s = 0;

        for (int i = 0; i < a.length; i++) {
            for (int k = i; k < a.length; k++) {


                int nr = 0;

                for (int j = i; j < k; j++) {
                    if (a[j] == b[nr]) {
                        nr++;

                    }
                    if (nr == b.length) {
                        s = nr;
                        break;
                    }
                }


            }


        }

        if (s == b.length)
            return true;

        return false;

    }
}
