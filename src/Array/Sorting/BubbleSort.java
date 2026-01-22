package Array.Sorting;

/*
* 1 5 6 4 2 3
* Place Maximum Element in the the last after each loop completion
* Intution is we compare the current elment with adjacent elment and if current
* is greater than adjacent we swap the element
*
* */

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {1,5,6,4,2,3};

        int n = nums.length;
        for (int i = 0; i < n-1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n-i-1; j++) {
                if (nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
        System.out.println(Arrays.toString(nums));
    }
}
