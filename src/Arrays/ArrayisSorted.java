package Arrays;

import java.util.Arrays;

public class ArrayisSorted {
    public static boolean Brute(int[] arr) {
        int[] brr = Arrays.copyOf(arr,arr.length);

        //Sort Clone Array
        Arrays.sort(brr);

        for (int i = 0; i < brr.length; i++) {
            if (brr[i]!=arr[i]){
                return false;
            }
        }

        return true;
    }

    public static boolean Better(int[] nums) {
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            if (nums[i]<nums[i-1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {90, 80, 100, 70, 40, 30};

        if (Better(arr)){
            System.out.println("Sorted");
        }else {
            System.out.println("Not Sorted");
        }
    }
}
