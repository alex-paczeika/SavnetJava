import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ME2 {


    static ArrayList<String> arrayList = new ArrayList<String>();



    public static ArrayList<String> permutations(String s, String prefix) {



        if (s.length() == 1) {
            arrayList.add(prefix + s);
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            permutations(s.substring(0, i) + s.substring(i + 1), "" + prefix + ch);

        }

        return arrayList;
    }

    public static int[] getPermutations(int n) {
        String numberInString = String.valueOf(n);
        ArrayList<String> arrayList2 = new ArrayList<String>();
        arrayList.clear();

        arrayList2 = permutations(numberInString, "");


        Collections.sort(arrayList2);

        for (int i = 0; i < arrayList2.size() - 1; i++) {
            if (arrayList2.get(i).equals(arrayList2.get(i + 1))) {
                arrayList2.remove(i);

            }

        }


        int[] arraynormal = new int[arrayList2.size()];


        for (int i = 0; i < arrayList2.size(); i++) {
            arraynormal[i] = Integer.valueOf(arrayList2.get(i));
        }



        return arraynormal;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(getPermutations(12)));
        System.out.println(Arrays.toString(getPermutations(23)));

    }
}