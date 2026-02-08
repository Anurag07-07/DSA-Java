package BinarySearch;

import java.util.Collections;
import java.util.List;

public class FirstandLastOccuranceofSortedArray {
    public static int[] Brute(int[] nums,int target) {
        /*
        * Traverse over an array using loop and as we have to find the first and last occurrance
        * we can use linear search  .One for finding the first index
        * One for finding the last index
        * Now as we have to find only first index we start from zero and traverse till me not get the first index of target
        * When we get it break the loop
        * Same for find the last index we start from n-1 and traverse till me not get the target value
        * */
        int[] ans = new int[2];
        int first = -1,last = -1;
        ans[0] = first;
        ans[1] = last;

        //Use Linear Search
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] == target){
                first = i;
                break;
            }
        }
        for (int i = n-1; i >=0 ; i--) {
            if (nums[i] == target){
                last = i;
                break;
            }
        }


        ans[0] = first;
        ans[1] = last;

        return ans;
    }

    public static int[] Better(int[] nums,int target) {
        /*
        * Intution
        * So we use binary search to find the first and last occurance of the element
        * We use two binary search one for finding the start and one for end
        * Now if I get start index there is a possibilty that same element will be present before it
        * So we search on left side to check if there is any other number same as target present or not
        * Same we do it for last index . in that we store the last occurance as mid but there is a possiblity that same element
        * present after that particular element so we search on right side of that element
        * */
        int n = nums.length;
        int start = 0,end = n-1;
        int first = -1;
        int last = -1;

        while (start<=end){
            int mid = start+(end-start)/2;
            if (nums[mid]==target){
                first = mid;
                end = mid-1;
            } else if (nums[mid]>target) {
                end = mid-1;
            }else {
                start = mid+1;
            }
        }

        start = 0;
        end = n-1;
        while (start<=end){
            int mid = start+(end-start)/2;
            if (nums[mid]==target){
                last = mid;
                start = mid+1;
            } else if (nums[mid]>target) {
                end = mid-1;
            }else {
                start = mid+1;
            }
        }

        int[] ans = new int[2];
        ans[0] = first;
        ans[1] = last;
        return ans;
    }
    public static int[] Optimal(int[] nums,int target) {
        /*
         * Intution
         * Lower Bound => the index where element is greater or equal to target
         * Upper Bound => the index where target is greater than to target
         * */
        int n = nums.length;
        int start = 0,end = n;

        while (start<end){
            int mid = start+(end-start)/2;
            if (nums[mid]>=target){
                end = mid;
            } else if (nums[mid]<target) {
                start = mid+1;
            }
        }

        start = 0;
        end = n;
        while (start<end){
            int mid = start+(end-start)/2;
            if (nums[mid]>target){
                end = mid;
            } else if (nums[mid]<target) {
                start = mid+1;
            }
        }

        int[] ans = new int[2];
//        ans[0] = first;
//        ans[1] = last;
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1,3,5,5,5,5,67,123,125};
    }
}
