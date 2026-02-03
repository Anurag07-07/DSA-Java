package Arrays;

public class MinimumIncrementbyK {
    public static int Solution(int[] nums,int k) {
        int ans = 0;
        int Max = Integer.MIN_VALUE;
        for (int x:nums) Max = Math.max(Max,x);

        for (int x:nums){
            //Find the Sub
            int sub = Max-x;
            if (sub%k!=0){
                return -1;
            }
            ans += sub/k;

        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums1 = {4,7,19,16};
        int[] nums2 = {4,4,4,4};
        int[] nums3 = {4,2,6,8};
        System.out.println(Solution(nums3,3));
    }
}
