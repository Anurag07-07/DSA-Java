package Arrays;

import java.util.ArrayList;

public class AlternateElement {
    public static void getAlternateRecu(int[] nums,int index,ArrayList<Integer> res) {
        if (index< nums.length){
            res.add(nums[index]);
            getAlternateRecu(nums,index+2,res);
        }
    }
    public static ArrayList<Integer> getAlternate(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        getAlternateRecu(nums,0,ans);
        return  ans;
    }
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
//        ArrayList<Integer> ans = new ArrayList<>();
//        for (int i = 0; i < arr.length; i+=2) {
//            ans.add(arr[i]);
//        }

        ArrayList<Integer> ans = getAlternate(arr);
        System.out.println(ans);
    }
}
