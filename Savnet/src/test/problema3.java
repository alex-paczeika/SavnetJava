package test;

public class problema3 {
	 public static void main(String[] args) {
	        System.out.println(next(new int[]{1, 5, 7, 2, 4}, 7));
	    }

	    public static int next(int[] arr, int n) {
	        for (int i = 0; i < arr.length; i++) {
	            if (n == arr[arr.length - 1]) {
	                return -1;
	            }
	            if (n == arr[i]) {
	                return arr[i + 1];
	            }
	        }
	        return -2;
	    }
}
