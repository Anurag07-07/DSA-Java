package Array.Subarray;

public class SubarraySumkPositive {
    public static void SubarrayEqualstoK(int[] nums,int k) {
        int l = 0;int sum = 0; int count = 0;
        for (int r = 0; r < nums.length; r++) {
            sum = sum + nums[r];

            while(sum>k){
                sum = sum - nums[l];
                l++;
            }

            if (sum==k){
                count++;
            }
        }
        System.out.println("The Subarrays is "+count);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 1, 1};
        int K = 3;
        SubarrayEqualstoK(arr,K);
    }
}
