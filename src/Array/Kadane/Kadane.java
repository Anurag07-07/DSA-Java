package Array.Kadane;

public class Kadane {
    public static int KadaneMaximum(int[] nums) {
        int maxSum = Integer.MIN_VALUE; //To Handle Negative Edge Cases
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
            maxSum = Math.max(maxSum,sum);
            if (sum<0) sum = 0;
        }
        return maxSum;
    }

    public static int CircularKadane(int[] nums) {
        int maxSum = KadaneMaximum(nums);

        //Invert the Array and also find the Total
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
            nums[i] = -nums[i]; // invert
        }


        int minSum = KadaneMaximum(nums);

        int CircularMax = total+minSum;

        if (CircularMax==0) return maxSum;

        return  Math.max(CircularMax,maxSum);
    }

    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        KadaneMaximum(arr);
        CircularKadane(arr);
    }
}
