package Arrays.Easy;

import java.util.ArrayList;
import java.util.Arrays;

public class RearrangeArray {
    public static void swap(ArrayList<Integer> arr,int start,int end) {
        int temp = arr.get(start);
        arr.set(start,arr.get(end));
        arr.set(end,temp);
    }

    public static ArrayList<Integer> Better(ArrayList<Integer> nums) {
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i)>nums.get(i-1) && (i)%2==0){
                swap(nums,i-1,i);
            }else if (nums.get(i)<nums.get(i-1) && (i)%2!=0){
                swap(nums,i-1,i);
            }
        }
        return nums;
    }
    public static void main(String[] args) {
//        int[] nums1 = {1,2,2,1};
//        int[] nums2 = {1,3,2};
//        Better(nums1);
    }
}
