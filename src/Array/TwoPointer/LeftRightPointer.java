package Array.TwoPointer;

import java.util.Arrays;

public class LeftRightPointer {
    public static void reverseArray(int[] nums) {
        int start = 0,end= nums.length-1;
        while (start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }

        System.out.println(Arrays.toString(nums));
    }

    public static boolean pairSumSorted(int[] nums,int target) {
        int start = 0,end = nums.length-1;
        while (start<end){
            int sum = nums[start]+nums[end];
            if (sum==target){
                return true;
            } else if (sum>target) {
                end--;
            }else {
                start++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
//        reverseArray(arr);
        if (pairSumSorted(arr,6)){
            System.out.println("Present");
        }else {
            System.out.println("Not Present");
        }
    }
}
