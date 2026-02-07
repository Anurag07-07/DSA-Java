package Arrays.Easy;

public class MaxiumConsecutiveOnes {
    public static void Brute(int[] nums,int k ) {
        int n = nums.length;
        int max = 0;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = i; j < n; j++) {
                if (nums[j]==0){
                    count++;
                }
                if (count<=k){
                    max = Math.max(max,j-i+1);
                }
            }
        }
        System.out.println(max);
    }

    public static void Better(int[] nums,int k) {
        int left = 0;
        int n = nums.length;
        int max  = 0;
        int count = 0;
        for (int right = 0; right < n; right++) {
            if (nums[right]==0){
                count++;
            }

            if (count>k){
                if (nums[left]==0){
                    count--;
                }
                left++;
            }

            max = Math.max(max,right-left+1);
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        int[] nums1 = {1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1};
        int[] nums2 = {1, 0, 0, 1, 0, 1, 0, 1};
        int[] nums3 = {0 ,1 ,1 ,1 ,0 ,1 ,1};
        Brute(nums3,2);
    }
}
