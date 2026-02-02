package Arrays;

import java.util.Arrays;

public class MoveallZerostoEndofArray {
    public static void Naive(int[] nums) {
        int[] ans = new int[nums.length];

        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=0){
                ans[j++] = nums[i];
            }
        }
        System.out.println(Arrays.toString(ans));
    }

    public static void Better(int[] nums) {
        int slow = 0;
        int n = nums.length;
        for (int fast = 0; fast < n; fast++) {
            if (nums[fast]!=0){
                nums[slow++] = nums[fast];
            }
        }

        while (slow<n){
            nums[slow++] = 0;
        }

        System.out.println(Arrays.toString(nums));
    }

    public static void swap(int[] nums,int start,int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
    public static void OneTravesalBetter(int[] nums) {
        int n = nums.length;
        int slow = 0;
        for (int fast = 0; fast < n; fast++) {
            if (nums[fast]!=0){
                swap(nums,slow,fast);
                slow++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
    public static void main(String[] args) {
        int[] nums = {1,2,0,4,3,0,5,0};
//        Naive(nums);
//        Better(nums);
        OneTravesalBetter(nums);
    }
}
