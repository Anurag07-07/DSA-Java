package Arrays.Easy;

public class SumofAllSubarray {
    public static void Naive(int[] nums) {
        int sum = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int temp = 0;
            for (int j = i; j < n; j++) {
                temp+= nums[j];
                sum+=temp;
            }
        }
        System.out.println(sum);
    }

    public static int Better(int[] nums) {
        int sum = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            sum+=(n-i)*(i+1)*nums[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] nums = {1,4,5,3,2};
        Naive(nums);
    }
}
