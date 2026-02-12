package PracticeSheet1;

import java.util.Arrays;
import java.util.HashSet;

public class LC41 {
    public static int Brute(int[] nums) {
        Arrays.sort(nums);
        int expected = 1;
        for (int x:nums){
            if (x==expected){
                expected++;
            }
        }
        return expected;
    }

    public static int Better(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int x:nums){
            set.add(x);
        }
        int i = 1;
        int n = nums.length;
        while (i<=n){
            if (!set.contains(i)){
                return i;
            }
            i++;
        }
        return i;
    }

    public static void swap(int[] nums,int start,int end) {
          int temp = nums[start];
          nums[start] = nums[end];
          nums[end] = temp;
    }

    public static int Optimal(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            while(nums[i]>0 && nums[i]<=n && nums[nums[i]-1]!=nums[i]){
                swap(nums,nums[i]-1,i);
            }
        }

        int i = 0;
        while(i<n){
            if(i+1!=nums[i]){
                return i+1;
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        int[] nums = {3,4,-1,1};
    }
}
