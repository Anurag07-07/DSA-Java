package Arrays.Easy;

public class EquiliriumIndex {
    public static void Brute(int[] nums) {
        int index = -1;
        for (int i = 0; i < nums.length; i++) {
            int left = i-1;
            int right = i+1;

            //Find the Sum of Element on right side
            int sum1 = 0;
            while(left>=0){
                sum1 +=nums[left];
                left--;
            }
            //Find the Sum of Element on left side
            int sum2 = 0;
            while (right< nums.length){
                sum2+=nums[right];
                right++;
            }

            if (sum2==sum1){
                index = i;
                break;
            }
        }
    }
    public static void Better(int[] nums) {
        int n = nums.length;
        int index = -1;
        int[] psum = new int[n];
        psum[0] = nums[0];
        for (int i = 1; i < n; i++) {
            psum[i] = psum[i-1]+nums[i];
        }
        for (int i = 0; i < n; i++) {
            int left;
            if (i==0){
                left = 0;
            }else{
                left = psum[i-1];
            }
            int right = psum[n-1]-psum[i];

            if (right==left){
                index = i;
                break;
            }
        }
        System.out.println(index);
    }
    public static int Optimal(int[] nums) {
        int total = 0;
        int n = nums.length;
        for (int x:nums){
            total+=x;
        }
        int left = 0;
        for (int i = 0; i < n; i++) {
            total -= nums[i];
            if (total==left){
                return i;
            }
            left+=nums[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {-7, 1, 5, 2, -4, 3, 0};
        Brute(nums);
        Better(nums);
        Optimal(nums);
    }
}
