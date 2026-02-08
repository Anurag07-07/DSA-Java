package BinarySearch;

public class SearchinSortedAndRotatedArray {
    public static int Better(int[] nums,int target) {
        /*
        Intution
        we are founding the mid  and now we have to chcek which region is sorted
        so we compare that mid elment with start element
        if we get mid element greater than  or equal to small element it means left side is sorted
        so we check the target if the taret is present in the sorted refion we serach on that side other wise on opposite side
        same we do if left side is sorted
        */

        int n = nums.length;
        int start = 0;
        int end = n-1;
        while (start<=end){
            int mid = start+(end-start)/2;
            if (nums[mid]==target){
                return mid;
            }

            if (nums[mid]>=nums[start]){
                if (nums[start]<=target && nums[mid]>target){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }else{
                if (nums[mid]<target && nums[end]>=target){
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        int ans = Better(nums,10);
        System.out.println(ans);
    }
}
