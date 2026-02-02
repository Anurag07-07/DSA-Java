package Arrays;

import java.util.ArrayList;
import java.util.List;

public class GenerateSubarray {
    public static void Brute(int[] nums) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {

            for (int j = i; j < n; j++) {
                List<Integer> temp = new ArrayList<>();
                for (int k = i; k <= j; k++) {
                    temp.add(nums[k]);
                }
                ans.add(temp);
            }
        }

        for (List<Integer> x:ans){
            System.out.print(x+" ");
        }
    }

    public static void SubarrayRec(int[] nums,int start,int end,ArrayList<Integer> temp) {
        if (start<=end){
            temp.add(nums[start]);
            SubarrayRec(nums,start+1,end,temp);
        }
    }

    public static void Better(int[] nums) {
        int n = nums.length;
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                ArrayList<Integer> temp = new ArrayList<>();
                SubarrayRec(nums,i,j,temp);
                arr.add(temp);
            }
        }
        System.out.println(arr);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
//        Brute(arr);
        Better(arr);

    }
}
