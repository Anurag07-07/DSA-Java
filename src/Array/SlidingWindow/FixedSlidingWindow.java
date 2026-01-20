package Array.SlidingWindow;

public class FixedSlidingWindow {
    public static void MaxSumSubarray(int[] nums,int k) {
        int sum = 0;
        int MaxSum = Integer.MIN_VALUE;
        for (int i = 0; i < k; i++) {
            sum+=nums[i];
        }

        MaxSum = Math.max(MaxSum,sum);

        for (int i = k; i < nums.length; i++) {
            sum = sum + nums[i] - nums[i-k];
            MaxSum = Math.max(MaxSum,sum);
        }

        System.out.println("The Max Sum is "+MaxSum);
    }

    public static void countSubarray(int[] nums,int k,int S) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum+=nums[i];
        }

        int count = 0;
        if (sum>=S){
            count++;
        }

        for (int i = k; i < nums.length; i++) {
            sum+=nums[i]-nums[i-k];
            if (sum>=S){
                count++;
            }
        }

        System.out.println("The Max Sum is "+count);
    }

    public static void main(String[] args) {
//        int[] arr1 = {2,1,5,1,3,2};
//        int k  = 3;
        int[] arr2 = {2, 1, 3, 4, 1, 2};
        int k = 3;
        int S = 6;
//        MaxSumSubarray(arr,k);

        countSubarray(arr2,k,S);
    }
}
