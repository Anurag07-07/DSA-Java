package PracticeSheet1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class LC26 {
    public static void Brute(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int x:nums){
            set.add(x);
        }

        ArrayList<Integer> arr = new ArrayList<>(set);
        Collections.sort(arr);

        int[] ans = new int[arr.size()];
        int i = 0;
        for (int x:nums){
            ans[i++] = x;
        }
    }

    public static int Better(int[] nums) {
        int s = 1;
        for (int f = 1; f < nums.length; f++) {
            if (nums[f]!=nums[s-1]){
                nums[s++] = nums[f];
            }
        }
        return s;
    }
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};

    }
}
