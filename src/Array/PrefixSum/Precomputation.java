package Array.PrefixSum;

import java.util.Arrays;
import java.util.Scanner;

public class Precomputation {
    public static int[] buildPrefix(int[] nums) {
        int n = nums.length;
        int[] psum = new int[n];
        psum[0] = nums[0];
        for (int i = 1; i < n; i++) {
            psum[i] = psum[i-1]+nums[i];
        }
        return psum;
    }

    public static void RangeQueries(int[] nums) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Queries");
        int Q = sc.nextInt();
        int[] psum = buildPrefix(nums);
        for (int i = 1; i <=Q ; i++) {
            System.out.println("Enter the left and Right Value");
            int left = sc.nextInt();
            int right = sc.nextInt();
            int sum = 0;
            for (int j = left; j <= right; j++) {
                if (left==0) sum = psum[right];
                else  sum = psum[right]-psum[left-1];
            }
            System.out.println("The Sum is "+sum);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
//        buildPrefix(arr);
        RangeQueries(arr);
    }
}
