package Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ProblemSet3 {
    public static void leftRotate(int[] nums) {
        int temp = nums[0];
        for (int i = 1; i < nums.length ; i++) {
            nums[i-1] = nums[i];
        }
        nums[nums.length-1] = temp;

        System.out.println(Arrays.toString(nums));
    }

    public static void rightRotate(int[] nums) {
        int temp = nums[nums.length-1];
        for (int i = nums.length-2; i >= 0; i--) {
            nums[i+1] = nums[i];
        }
        nums[0] = temp;

        System.out.println(Arrays.toString(nums));
    }

    public static void reverse(int[] arr,int start,int end) {
        while (start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;end--;
        }
    }

    public static void rightRotateK(int[] nums,int k) {
        k = k%(nums.length);
        reverse(nums,0, nums.length-1);
        reverse(nums,0, k-1);
        reverse(nums,k, nums.length-1);

        System.out.println(Arrays.toString(nums));
    }

    public static void leftRotateK(int[] nums,int k) {
        k = k%(nums.length);
        reverse(nums,0, k-1);
        reverse(nums,k, nums.length-1);
        reverse(nums,0, nums.length-1);

        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
//        leftRotate(arr);
//        rightRotate(arr);
//        rightRotateK(arr,2);
        leftRotateK(arr,3);
        
    }
}
