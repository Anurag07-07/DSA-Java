package Arrays.Easy;

import java.util.HashSet;

public class DuplicateWithKDIstanceintheArray {
    public static boolean Naive(int[] nums,int k) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <=k && i+j<n; j++) {
                int c = i+j;
                if (nums[i]==nums[c]){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean Optimal(int[] nums,int k) {
        HashSet<Integer> s = new HashSet<>();
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (j-i+1>k){
                s.remove(nums[i]);
                i++;
            }

            if (s.contains(nums[j])){
                return true;
            }

            s.add(nums[j]);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4,1,2,3,4};
        int[] nums2 = {1,2,3,1,4,5};
        int[] nums3 = {1,2,3,4,5};
        int k = 3;
        if (Naive(nums1,k)){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
