package Test.SectionA;

public class Question4 {
    public static int LowerBound(int[] nums,int target) {
        int low = 0,high = nums.length;
        int ans = high;
        while (low<high){
            int mid = low+(high-low)/2;
            if (nums[mid]>=target){
                ans = mid;
                high = mid;
            }else {
                low = mid+1;
            }
        }
        return ans;
    }
    public static int UpperBound(int[] nums,int target) {
        int low = 0,high = nums.length;
        int ans = high;
        while (low<high){
            int mid = low+(high-low)/2;
            if (nums[mid]>target){
                ans = mid;
                high = mid;
            }else {
                low = mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,2,2,3,3,4};
        int k = 2;

        int start = LowerBound(nums,k);
        int end = UpperBound(nums,k);

        System.out.println("The Length is "+(end-start));
    }
}
