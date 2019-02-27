import java.util.Arrays;

public class TestEA23 {
    public static void main(String[] args) {
        System.out.println(camelCase(" ANA are MERE"));
    }

    public static String camelCase(String input) {
        input = input.toLowerCase();
        input = input.trim();
        String[] array = input.split("");



        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(" ") && i != 0) {
                array[i + 1] = array[i + 1].toUpperCase();
            }
        }
        String str = "";
        for (int i = 0; i < array.length; i++) {


            str += array[i] + "";
        }

        str = str.replace(" ", "");

        return str;
    }

}
