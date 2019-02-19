import java.util.Arrays;

public class TestME1 {
    public static void main(String[] args) {


        countSums(new int[]{1, 2, 3, 5, 7}, 10);

    }


    public static int rezultatul = 0;
    public static int s = 0;
    private static int[] set;
    private static int[] elementulSelectat;
    private static int targetSum;
    private static int numarulDeElemente;


    public static int countSums(int[] arr, int n) {
        TestME1 subSetSum = new TestME1();
        if (arr.length == 0)
            return 0;
        subSetSum.findSubSets(arr, n);

        System.out.println(rezultatul);
        return rezultatul;


    }

    public void findSubSets(int[] set, int targetSum) {
        this.set = set;
        this.numarulDeElemente = set.length;
        this.targetSum = targetSum;
        elementulSelectat = new int[numarulDeElemente];
        Arrays.sort(set);
        int sumaTuturorElementelor = 0;
        for (int element : set) {
            sumaTuturorElementelor = sumaTuturorElementelor + element;
        }
        findSubSets(0, 0, sumaTuturorElementelor);
    }

    private void findSubSets(int sumaPanaAcum, int i, int sumaRamasa) {
        elementulSelectat[i] = 1;
        if (targetSum == set[i] + sumaPanaAcum) {

            rezultatul++;
        }


        if ((i + 1 < numarulDeElemente) && (sumaPanaAcum + set[i] + set[i + 1] <= targetSum)) {
            findSubSets(sumaPanaAcum + set[i], i + 1, sumaRamasa - set[i]);
        }


        if ((i + 1 < numarulDeElemente) && (sumaPanaAcum + set[i + 1] <= targetSum)
                && (sumaPanaAcum + sumaRamasa - set[i] >= targetSum)) {
            findSubSets(sumaPanaAcum, i + 1, sumaRamasa - set[i]);
        }
    }


}

