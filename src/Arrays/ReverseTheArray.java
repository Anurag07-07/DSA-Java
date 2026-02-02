package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReverseTheArray {
    public static void Naive(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = nums.length-1; i >=0 ; i--) {
            ans.add(nums[i]);
        }

        Integer[] ans1 = new Integer[ans.size()];
        ans1 = ans.toArray(ans1);

        System.out.println(Arrays.toString(ans1));
    }

    public static void TwoPointer(int[] nums) {
        int start = 0,end = nums.length-1;
        while (start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void Recursive(int[] nums,int start,int end) {
        if (start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            Recursive(nums,start+1,end-1);
        }
    }

    public static void RecursiveAppraoch(int[] nums) {
        int start = 0,end = nums.length-1;

        Recursive(nums,start,end);

        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
//        Naive(nums);
//        TwoPointer(nums);
        RecursiveAppraoch(nums);
    }
}
