package BinarySearch;

import java.util.ArrayList;

public class SieveofSomeone {
    public static void main(String[] args) {
        int[] nums  ={0,2,6,7,6,3,1};
        int start = 0,end = nums.length-1;
        while (start<end){
            int mid = start+(end-start)/2;
            if(nums[mid]>nums[mid+1]){
                end = mid;
            }else {
                start = mid+1;
            }
        }

        System.out.println(nums[end]);
    }
}
