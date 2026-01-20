package Array.TwoPointer;

import java.util.Arrays;

public class ThreePointer {
    public static void swap(int[] arr,int start,int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
    public static void SortColors(int[] nums) {
        int n = nums.length;
        int low = 0,mid = 0,high = n-1;
        while (mid<=high){
            if (nums[mid]==0){
                swap(nums,low,mid);
                low++;mid++;
            } else if (nums[mid]==2) {
                swap(nums,low,high);
                high--;
            }else {
                mid++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
    public static void main(String[] args) {
        int[] arr = {0,0,0,1,1,0,0,2,2,1,1,0,0};
        SortColors(arr);
    }
}
