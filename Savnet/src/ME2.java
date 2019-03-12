import java.util.ArrayList;
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
        ArrayList<String> arrayList = new ArrayList<String>();


        arrayList = permutations(numberInString, "");


        Collections.sort(arrayList);

        for (int i = 0; i < arrayList.size() - 1; i++) {
            if (arrayList.get(i).equals(arrayList.get(i + 1))) {
                arrayList.remove(i);

            }

        }

        System.out.println(arrayList.size());
        int[] arraynormal = new int[arrayList.size()];


        for (int i = 0; i < arrayList.size(); i++) {
            arraynormal[i] = Integer.valueOf(arrayList.get(i));

        }

        for (int i = 0; i < arraynormal.length; i++) {
            System.out.println(arraynormal[i]);
        }

        System.out.println(arraynormal.length);
        return arraynormal;
    }

    public static void main(String[] args) {


        getPermutations(7);

    }
}