package Arrays.Easy;

import java.util.ArrayList;
import java.util.List;

public class SortedSubsequence {
    public static List<Integer> Brute(int[] nums) {
        //Create a smaller element
        int min = 0;
        int n = nums.length;
        int[] smaller = new int[n];
        smaller[0] = -1;
        for (int i = 1; i < n; i++) {
            if (nums[i]<=nums[min]){
                min = i;
                smaller[i] = -1;
            }else {
                smaller[i] = min;
            }
        }

        int max = n-1;
        int[] greater = new int[n];
        greater[n-1] = -1;
        for (int i = n-2; i >=0 ; i--) {
            if (nums[i]>=nums[max]){
                max = i;
                greater[i] = -1;
            }else {
                greater[i] = max;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (smaller[i]!=-1 && greater[i]!=-1){
                ans.add(nums[smaller[i]]);
                ans.add(nums[i]);
                ans.add(nums[greater[i]]);
                break;
            }
        }

        return ans;
    }

    public static List<Integer> find3Numbers(int[] arr) {
        List<Integer> result = new ArrayList<>();
        if (arr.length < 3) return result;

        int small = Integer.MAX_VALUE;
        int mid = Integer.MAX_VALUE;
        int valAtLow = Integer.MAX_VALUE; // Store the small value associated with current mid

        for (int x : arr) {
            if (x <= small) {
                small = x;
            } else if (x <= mid) {
                mid = x;
                valAtLow = small; // Link this mid to the valid small we found earlier
            } else {
                // Found the third element > mid
                result.add(valAtLow);
                result.add(mid);
                result.add(x);
                return result;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {109 ,262, 93, 737, 537};
        List<Integer> ans = find3Numbers(arr);
        System.out.println(ans);
    }
}
