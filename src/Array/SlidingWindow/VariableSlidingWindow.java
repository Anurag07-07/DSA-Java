package Array.SlidingWindow;

/*
k = 7
        l
* 2,1,5,1,3,2
*            r

sum = 5
len = r-l+1
malen = 3
*
* */

import java.util.HashSet;

public class VariableSlidingWindow {
    public static void longestSubarraySumK(int[] nums,int k) {
        int l = 0;int sum = 0;int maxLen = 0;
        int n = nums.length;
        for (int r = 0; r < n; r++) {
            sum+=nums[r];

            while (sum>k){
                sum = sum - nums[l];
                l++;
            }

            maxLen = Math.max(maxLen,r-l+1);
        }

        System.out.println("The Max Length is "+maxLen);
    }

    public static void longestUnique(int[] nums) {
        int l = 0;int maxLen = 0;int n = nums.length;
        HashSet<Integer> s = new HashSet<>();
        for (int r = 0; r < n; r++) {
            while (s.contains(nums[r])){
                s.remove(nums[l]);
                l++;
            }
            s.add(nums[r]);
            maxLen = Math.max(maxLen,r-l+1);
        }

        System.out.println("The Maxlen is "+(maxLen));
    }


    public static void main(String[] args) {
        int[] arr = {2,1,5,1,3,2};
//        int k = 7;
//        longestSubarraySumK(arr,k);
        longestUnique(arr);
    }
}
