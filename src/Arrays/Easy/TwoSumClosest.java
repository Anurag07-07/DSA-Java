package Arrays.Easy;

import java.util.Arrays;

public class TwoSumClosest {
    public static void Brute(int[] nums) {
        int n  = nums.length;
        int ans = nums[0]+nums[1];
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                int sum = nums[i]+nums[j];
                if (Math.abs(ans)>Math.abs(sum)){
                    ans = sum;
                }else  if (Math.abs(sum)==Math.abs(ans)){
                    ans = Math.max(ans,sum);
                }
            }
        }
        System.out.println(ans);
    }

    public static int Better(int[] nums) {
        Arrays.sort(nums);
        int ans = Integer.MAX_VALUE;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int left = nums[i];
            int start = i+1,end = n-1;
            while (start<=end){
                int mid = start+(end-start)/2;
                int sum = left+nums[mid];
                if (sum==0){
                    return 0;
                }

                if (Math.abs(sum)<Math.abs(ans)){
                    ans = sum;
                }

                else if (Math.abs(sum)==Math.abs(ans)){
                    ans = Math.max(ans,sum);
                }

                if (sum<0){
                    start = mid+1;
                }else {
                    end = mid-1;
                }
            }
        }
        return ans;
    }

    public static int Optimal(int[] nums) {
        int n = nums.length;
        int start = 0,end = n-1;
        Arrays.sort(nums);
        int ans = nums[start]+nums[end];
        while (start<end){
            int sum = nums[start]+nums[end];
            if (sum==0){
                return 0;
            }

            if (Math.abs(sum)<Math.abs(ans)){
                ans = sum;
            } else if (Math.abs(sum)==Math.abs(ans)) {
                ans = Math.max(ans,sum);
            }

            if (sum<0){
                start++;
            }else {
                end--;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {-8,5,2,-6};
        Brute(nums);
    }
}
