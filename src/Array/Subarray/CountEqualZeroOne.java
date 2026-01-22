package Array.Subarray;

import java.util.HashMap;

public class CountEqualZeroOne {
    public static int CountEqualXor(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int count = 0,sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + (nums[i] == 0 ? -1:1);
            count = count + hm.getOrDefault(sum,0);
            hm.put(sum,hm.getOrDefault(sum,0)+1);
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr  =  {0,0,0,0,1,1,1,1,0,0,0,1,1,1,0,0,1,1,0,1};
        CountEqualXor(arr);
    }
}
