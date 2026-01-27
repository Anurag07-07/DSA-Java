package Array.Sorting;

import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int[] nums = {4, 2, 2, 8, 3, 3, 1};

        int n = nums.length;
        int max = Arrays.stream(nums).max().getAsInt();

        int[] count = new int[max+1];
        for (int x:nums){
            count[x]++;
        }

        int k = 0;
        for (int i = 0; i <= max; i++) {
            while (count[i]-->0){
                nums[k++] = i;
            }
        }

        System.out.println(Arrays.toString(nums));
    }
}
