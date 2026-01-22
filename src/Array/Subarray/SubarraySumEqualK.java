package Array.Subarray;

import java.util.HashMap;

public class SubarraySumEqualK {
    public static void SumEqualK(int[] nums,int K) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(0,1);
        int count = 0;int sum = 0;
        for (int x:nums){
            sum += x;
            if (hm.containsKey(sum-K)){
                count = count + hm.get(sum-K);
            }

            hm.put(sum,hm.getOrDefault(sum,0)+1);
        }

        System.out.println("The Count is "+count);
    }
    public static void main(String[] args) {
        //Negative Present
        int[] arr = {1,1,1};
        int k = 2;
        SumEqualK(arr,k);
    }
}
