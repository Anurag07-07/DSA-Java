package PracticeSheet1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class LC448 {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        List<Integer> arr = new ArrayList<>();
        for (int i = 1; i <=n; i++) {
            boolean isthere = false;
            for (int j = 0; j < n; j++) {
                if (nums[j]==i){
                    isthere = true;
                    break;
                }
            }

            if (!isthere){
                arr.add(i);
            }
        }
        return arr;
    }
    public static List<Integer> findDisappearedNumbersBetter(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for (int x:nums){
            set.add(x);
        }

        List<Integer> arr = new ArrayList<>();
        for (int i = 1; i <=n; i++) {
            if (!set.contains(i)) {
                arr.add(i);
            }
        }
        return arr;
    }

    public static List<Integer> findDisappearedNumbersOptimal(int[] nums) {
        int n = nums.length;
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int value= Math.abs(nums[i]);
            int index = value-1;
            if (nums[index]>0){
                nums[index] = -nums[index];
            }
        }

        for (int i = 0; i < n; i++) {
            if (nums[i]>0){
                arr.add(i+1);
            }
        }
        return  arr;
    }


    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        findDisappearedNumbers(nums);
    }
}
