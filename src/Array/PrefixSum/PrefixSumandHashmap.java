package Array.PrefixSum;

/*
Hashmap
0 1
1 1
3 1
6 1

        i
* 1 2 3


k = 3

sum = 6
sum - k = 3

count = 2
* */

import java.util.HashMap;

public class PrefixSumandHashmap {
    public static int SubarrayCount(int[] nums,int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(0,1);
        int count = 0;int sum = 0;
        for (int x:nums){
            sum += x;

            if (hm.containsKey(sum-k)){
                count+=hm.get(sum-k);
            }

            hm.put(sum,hm.getOrDefault(sum,0)+1);
        }

        return count;
    }

    public static int EquilbriumIndex(int[] nums) {
        int total = 0;
        for (int x:nums){
            total+=x;
        }
        int left = 0;
        for (int i = 0; i < nums.length; i++) {
            total-=nums[i];
            if (left==total) return i;
            left+=nums[i];
        }
        return -1;
    }

    public static int longestSubarray(int[] nums,int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int maxlen = 0;int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            if (sum==k){
                maxlen = i+1;
            }

            if (!hm.containsKey(sum)){
                hm.put(sum,i);
            }

            if (hm.containsKey(sum-k)){
                maxlen = Math.max(maxlen,i-hm.get(sum-k));
            }
        }
        return maxlen;
    }

    public static void main(String[] args) {
//        int[] arr1 = {1,2,3};
//        int[] arr2 = {-7,1,5,2,-4,3,0};
        int[] arr3 = {10,5,2,7,1,-10};
        int k = 15;
//        int k = 3;
//        int ans = SubarrayCount(arr1,k);
//        System.out.println(ans);
//        int ans = EquilbriumIndex(arr2);
//        System.out.println(ans);
         longestSubarray(arr3,k);
    }
}
