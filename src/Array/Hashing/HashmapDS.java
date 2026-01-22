package Array.Hashing;

import java.util.HashMap;

public class HashmapDS {
    public static int[] TwoSumOnrPass(int[] nums,int target) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int need = target-nums[i];
            if (hm.containsKey(need)){
                return new int[]{hm.get(need),i};
            }
            hm.put(nums[i],i);
        }
        return new int[]{0};
    }

    public static int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int x:nums){
            map.put(x,map.getOrDefault(x,0)+1);
            if (map.get(x)> nums.length/2){
                return x;
            }
        }
        return -1;
    }

    public static int subarraySum(int[] nums,int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(0,1);
        int count = 0;int sum = 0;
        for (int x:nums){
            sum+=x;
            count = count + hm.getOrDefault(sum-k,0);
            hm.put(sum,hm.getOrDefault(sum,0)+1);
        }
        return count;
    }
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(1,2);
        map.put(2,3);
        map.put(3,4);
        map.put(4,5);
        System.out.println(map.get(1));
        System.out.println(map.containsKey(1));
        System.out.println(map.remove(3)); //it will return the value
        System.out.println(map.size());
    }
}
