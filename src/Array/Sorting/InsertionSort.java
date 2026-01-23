package Array.Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] nums = {3,2,1,6,5,4,5};

        int n = nums.length;

        for (int i = 1; i < n; i++) {
            int key = nums[i];
            int j = i-1;
            while (j>=0 && nums[j]>key){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = key;
        }

        System.out.println(Arrays.toString(nums));
    }
}
