package BinarySearch;

class Count1 {
    public static int LowerBound(int[] nums,int target){
        int n = nums.length;
        int start = 0,end = n-1;
        int ans = -1;
        while (start<=end){
            int mid = start+(end-start)/2;
            if (nums[mid]==target){
                ans = mid;
                start = mid+1;
            } else if (nums[mid]<target) {
                end = mid-1;
            }else {
                start = mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1,0,0,0};
        int lower = LowerBound(nums,1);
        System.out.println(lower+1);
    }
}