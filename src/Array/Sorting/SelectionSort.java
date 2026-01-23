package Array.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {3,2,1,6,5,4};

        int n = nums.length;

        for (int i = 0; i < n-1; i++) {
            int minIdx = i;
            for (int j = i+1; j < n; j++) {
                if (nums[j]<nums[minIdx]){
                    minIdx = j;
                }
            }

            int temp = nums[minIdx];
            nums[minIdx] = nums[i];
            nums[i] = temp;
        }

        System.out.println(Arrays.toString(nums));
    }
}
