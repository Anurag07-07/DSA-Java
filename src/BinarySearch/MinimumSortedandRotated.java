package BinarySearch;

public class MinimumSortedandRotated {
    public static int Better(int[] nums) {
        /*
        * Intution
        * Array is sorted so we find the mid element
        * if mid element is smaller than last element it means that there is no smalller value bw mid and high so we have to search
        * the element on left side considering mid as high point
        * Now if mid is greater than high there must be possiblity that there is more smaller elment present on right side so we search on right side
        *
        * */
        int n = nums.length;
        int start = 0,end = n-1;
        if (nums[start]<nums[end]){
            return nums[start];
        }

        while (start<end){
            int mid = start+(end-start)/2;

            if (nums[mid]>nums[end]){
                start = mid+1;
            }else {
                end = mid;
            }
        }
        return nums[start];
    }
    public static void main(String[] args) {
        int[] nums = {5,6,1,2,3,4};
        int ans = Better(nums);
        System.out.println(ans);
    }
}
