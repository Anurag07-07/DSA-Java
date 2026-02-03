package Arrays;

public class MinimumCost {
    public static void main(String[] args) {
        int[] nums = {4,3};
        int mini = Integer.MAX_VALUE;
        for (int x:nums) mini = Math.min(mini,x);
        int n = (nums.length-1)*mini;

        System.out.println(n);
    }
}
