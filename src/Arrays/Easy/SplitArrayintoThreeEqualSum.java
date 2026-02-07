package Arrays.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SplitArrayintoThreeEqualSum {
    public static int Sum(int[] nums,int start,int end) {
        int sum = 0;
        for (int i = start; i <=end ; i++) {
            sum+=nums[i];
        }
        return sum;
    }
    public static int[] Brute(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n-2; i++) {
            for (int j = i+1; j < n-1; j++) {
                int sum1 = Sum(nums,0,i);
                int sum2 = Sum(nums,i+1,j);
                int sum3 = Sum(nums,j+1,n-1);
                if (sum1==sum2 && sum2==sum3){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }

    public static List<Integer> Better(int[] nums) {
        int total = Arrays.stream(nums).sum();
        int target = total/3;

        List<Integer> arr = new ArrayList<>(Arrays.asList(-1,-1));
        if (total%3!=0){
            return arr;
        }
        int n = nums.length;
        int sum = 0;
        int count = 0;
        for (int i = 0; i < n-1; i++) {
            sum+= nums[i];
            if (sum==target){
                arr.set(count++,i);
                sum = 0;
            }
            if (count==2){
                break;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] nums1= {1,3,4,0,4};
        int[] nums2= {2,3,4};
        int[] nums3= {1,-1,1,-1,1,-1,1,-1};
//        int[] nums4 = {2, 4 ,3 ,1, 1, 1 ,3 ,2, 3 ,3 ,1 ,2 ,5, 5, 1, 5, 5, 1};
        int[] ans = Brute(nums3);
        List<Integer> ans1 = Better(nums3);
        System.out.println(ans1);
    }
}
