public class TestEA22 {
    public static void main(String[] args) {
        String alex = "1 ,5, 32, 8";
        System.out.println(stringSum(alex));
    }

    public static int stringSum(String input) {

        if (input == "")
            return 0;

        input = input.replace(" ", "");
        String[] numereleString = input.split(",");


        Integer[] intarray = new Integer[numereleString.length];

        int i = 0;
        for (i = 0; i < numereleString.length; i++) {
            intarray[i] = Integer.parseInt(numereleString[i]);

        }

        //sumas
        int sum = 0;
        for (i = 0; i < intarray.length; i++) {
            sum = sum + intarray[i];
        }
        return sum;
    }

}
