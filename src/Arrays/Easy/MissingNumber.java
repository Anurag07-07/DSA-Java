package Arrays.Easy;

import java.util.ArrayList;
import java.util.HashSet;

public class MissingNumber {
    public static int Naive(int[] nums) {
        int n = nums.length;
        for (int i = 1; i <= n; i++) {
            boolean flag = true;
            for (int j = 0; j < n; j++) {
                if (nums[j]==i){
                    flag = false;
                    break;
                }
            }
            if (flag){
                return i;
            }
        }
        return n;
    }

    public static int Better(int[] nums) {
        //HashSet
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for (int x:nums){
            set.add(x);
        }

        for (int i = 1; i <= n; i++) {
            if (!set.contains(i)){
                return i;
            }
        }
        return n;
    }

    public static int Optimal1(int[] nums) {
        int n = nums.length+1;
        int sum1 = (n*(n+1))/2;

        int sum2 = 0;
        for (int x:nums){
            sum2+=x;
        }

        return sum1-sum2;
    }

    public static int Optimal2(int[] nums) {
        int n = nums.length+1;
        int XOR1 = 0;
        for (int i = 1; i <= n; i++) {
            XOR1 = XOR1^i;
        }

        int XOR2 = 0;
        for (int i = 0; i < n-1; i++) {
            XOR2 = XOR2^nums[i];
        }

        int ans = XOR1^XOR2;

        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {8, 2, 4, 5, 3, 7, 1};
//        int ans1 = Naive(nums);
//        int ans2 = Better(nums);
        int ans3 = Optimal1(nums);
        int ans4 = Optimal2(nums);
//        System.out.println(ans1);
//        System.out.println(ans2);
        System.out.println(ans3);
        System.out.println(ans4);
    }
}
