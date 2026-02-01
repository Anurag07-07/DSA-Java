package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LeaderInArray {
    public static void Brute(int[] nums) {

        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];
            boolean flag = false;
            for (int j = i+1; j < nums.length; j++) {
                if (nums[j]>value){
                    flag = true;
                }
            }
            if (!flag){
                ans.add(value);
            }
        }

        System.out.println(ans);
    }

    public static void Better(int[] nums) {
        int max = nums[nums.length-1];

        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(max);
        for (int i = nums.length-2; i >=0 ; i--) {
            if (nums[i]>max){
                max = nums[i];
                ans.add(nums[i]);
            }
        }
        Collections.reverse(ans);
        System.out.println(ans);
    }
    public static void main(String[] args) {
        int[] arr = {16,17,4,3,5,2};
        Brute(arr);
        Better(arr);
    }
}
