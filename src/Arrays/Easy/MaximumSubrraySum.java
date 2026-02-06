package Arrays.Easy;

public class MaximumSubrraySum {
    public static void Brute(int[] nums){
        int n = nums.length;
        int largest_sum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum+= nums[j];
            }
            largest_sum = Math.max(largest_sum,sum);
        }
        System.out.println(largest_sum);
    }

    public static void Optimal(int[] nums) {
        int largest = Integer.MIN_VALUE;
        int sum = 0;
        for (int x:nums){
            sum+=x;
            largest = Math.max(largest,sum);
            if (sum<0) sum = 0;
        }
        System.out.println(largest);
    }
    public static void main(String[] args) {
        int[] nums = {2,3,-8,7,-1,2,3};
        Optimal(nums);
    }
}
