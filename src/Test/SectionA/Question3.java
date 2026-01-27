package Test.SectionA;

import java.util.Arrays;

public class Question3 {
    public static void Reversal(int[] arr,int start,int end) {
        while (start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void Rotation(int[] nums,int k) {
        int n = nums.length;
        k = k%n;

        Reversal(nums,0,n-1);
        Reversal(nums,0,k-1);
        Reversal(nums,k,n-1);

        System.out.println(Arrays.toString(nums));
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        int k = 4;

        //Reversal
        Reversal(nums,0, nums.length-1);

        //Rotation
        Rotation(nums,k);
    }
}
