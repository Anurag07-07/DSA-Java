package Arrays.Easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MissingandRepeating {
    public static void Brute(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for (int x:nums){
            hm.put(x,hm.getOrDefault(x,0)+1);
        }
        int missing = -1;
        int repeating = -1;
        int n = nums.length+1;
        for (int i = 1; i <=n; i++) {
            if (!hm.containsKey(i)) {
                missing = i;
                break;
            }
        }

        for (Map.Entry<Integer,Integer> e: hm.entrySet()){
            if (e.getValue()>1){
                repeating = e.getKey();
            }
        }

        System.out.println(repeating+" "+missing);
    }

    public static void Better(int[] nums) {
        int n = nums.length;
        int repeating = -1;
        int missing  = -1;
        for (int i = 0; i < n; i++) {
            int value = Math.abs(nums[i]);

            //Change the Value to negative at that index
            if (nums[value-1]>0){
                nums[value-1] = -nums[value-1];
            }else {
                repeating = value;
            }

        }

        //Check the Value if that is Negative make it positive
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>0){
                missing = i+1;
            }
        }
        System.out.println(repeating+" "+missing);
    }
    public static void main(String[] args) {
        int[] nums = {4,3,6,2,1,1};
        Brute(nums);
        Better(nums);
    }
}
