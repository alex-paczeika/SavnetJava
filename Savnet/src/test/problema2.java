package test;

public class problema2 {
	 public static void main(String[] args) {
	        System.out.println(isSorted(new int[]{1, 8, 7}));
	    }

	    public static boolean isSorted(int[] arr) {
	        int nr = 0;
	        for (int i = 0; i < arr.length - 1; i++) {
	            if (arr[i] <= arr[i + 1]) {
	                nr++;
	            }
	        }
	        if (nr == arr.length - 1) {
	            return true;
	        }
	        return false;
	    }
}
