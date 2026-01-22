package Array.Subarray;

import java.util.HashMap;

public class LongestSubarraySum {
    public static int LongestSubarraySumEqualK(int[] nums,int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int maxlen = 0;int count = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];

            if (sum==k){
                maxlen = i+1;
            }

            if (hm.containsKey(sum-k)){
                maxlen = Math.max(maxlen,i- hm.get(sum-k));
            }

            hm.putIfAbsent(sum,i); //Storing th earliest Index
        }

        return maxlen;
    }
    public static void main(String[] args) {
        int[] arr = {1, -1, 5, -2, 3};
        int K = 3;
    }
}
