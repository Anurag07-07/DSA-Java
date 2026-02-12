package PracticeSheet1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LC977 {
    public static void Brute(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int x:nums){
            arr.add(x*x);
        }

        Collections.sort(arr);
        int[] ans = new  int[arr.size()];
        int j = 0;
        for (int x:arr){
            ans[j++] = x;
        }

        return;
    }

    public static void swap(int[] nums,int start,int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
    public static void Better(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i]*nums[i];
        }

        int i = 0,j = nums.length-1;
        while(i<j){
            if (nums[i]>nums[j]){
                swap(nums,i,j);
            }
            j--;
        }

        System.out.println(Arrays.toString(nums));
    }
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
//        Brute(nums);
        Better(nums);
    }
}
