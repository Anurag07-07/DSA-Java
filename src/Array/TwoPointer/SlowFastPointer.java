package Array.TwoPointer;

import java.util.Arrays;

public class SlowFastPointer {
    public static void moveZeroes(int[] nums) {
        int n = nums.length;
        int slow = 0;
        for (int fast = 0; fast < n; fast++) {
            if (nums[fast]!=0){
                nums[slow] = nums[fast];
                slow++;
            }
        }

        while (slow<n){
            nums[slow++] = 0;
        }
    }

    public static void removeDuplicates(int[] nums) {
        int n = nums.length;
        int slow = 1;
        for (int fast = 1; fast < n; fast++) {
            if (nums[fast]!=nums[slow-1]){
                nums[slow] = nums[fast];
                slow++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
    public static void main(String[] args) {
//        int[] arr1 = {1,2,3,4,5,6,7,8,9};
//        int[] arr2 = {0,2,3,0,0,0,7,8,9};

        int[] arr3 = {1,1,2,3,3,3,4,4,5,6};

    }
}
