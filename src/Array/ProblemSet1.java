package Array;

import java.util.Arrays;

public class ProblemSet1 {
    public static void reverseArray(int[] nums) {
        int left = 0,right = nums.length-1;
        while (left<right){
            int temp = nums[right];
            nums[right] = nums[left];
            nums[left] = temp;

            left++;
            right--;
        }

        System.out.println(Arrays.toString(nums));
    }

    public static boolean CheckPalindrone(int[] nums) {
        int left = 0,right = nums.length-1;
        while (left<right){
            if (nums[left]!=nums[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static boolean PairSumSorted(int[] nums,int target) {
        int left = 0,right = nums.length-1;
        while (left<right){
            int sum = nums[left]+nums[right];
            if (sum==target){
                return true;
            } else if (sum>target) {
                right--;
            }else {
                left++;
            }
        }
        return false;
    }

    public static void SecondMax(int[] nums) {
        int s_max = -1;
        int max = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>max){
                s_max = max;
                max = nums[i];
            } else if (nums[i]<max && nums[i]>s_max) {
                s_max = nums[i];
            }
        }

        System.out.println("The Second Max Element is "+s_max);
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,3,5,1};
        int[] arr3 = {1,2,3,9,12};
//        reverseArray(arr2);
//        if (CheckPalindrone(arr2)){
//            System.out.println("Yes");
//        }else {
//            System.out.println("No");
//        }

//        if (PairSumSorted(arr3,10)){
//            System.out.println("Present");
//        }else {
//            System.out.println("Not Present");
//        }
        SecondMax(arr3);
    }
}
