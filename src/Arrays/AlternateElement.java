package Arrays;

import java.util.ArrayList;

public class AlternateElement {
    public static void alterElementRec(int[] nums,int index,ArrayList<Integer> ans) {
        if (index< nums.length){
           ans.add(nums[index]);
            alterElementRec(nums,index+2,ans);
        }
    }

    public static ArrayList<Integer> alterElment(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        alterElementRec(nums,0,arr);
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        ArrayList<Integer> ans = alterElment(arr);
        System.out.println(ans);
    }
}
