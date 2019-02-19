public class TestEA13 {
    public static void main(String[] args) {
        System.out.println(getMaxTriple(new int[]{} ));
    }
    public static int getMaxTriple(int[] arr) {
        int suma = 0;
        if (arr.length > 2) {
            for (int i = 0; i < arr.length - 2; i++) {
                if ((arr[i] + arr[i + 1] + arr[i + 2]) > suma) {
                    suma = arr[i] + arr[i + 1] + arr[i + 2];
                }
            }
        }
        if(arr.length == 2) {
            suma =  arr[0]+arr[1];
        }
        if (arr.length == 1)
            suma=arr[0];
        return  suma;
    }
}
