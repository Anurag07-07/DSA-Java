package Array.Subarray;

import java.util.HashMap;

public class CountSubarraywithXorK {
    public static int SubarrayXorK(int[] nums,int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(0,1);
        int count = 0,xr = 0;
        for (int i = 0; i < nums.length; i++) {
            xr = xr ^ nums[i];

            if (hm.containsKey(xr^k)){
                count = count + hm.get(xr^k);
            }

            hm.put(xr,hm.getOrDefault(xr,0)+1);
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {4,2,2,6,4};
        int k = 6;
        int ans = SubarrayXorK(arr,k);
        System.out.println(ans);
    }
}
