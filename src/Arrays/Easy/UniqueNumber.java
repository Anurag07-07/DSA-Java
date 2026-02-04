package Arrays.Easy;

import java.util.HashMap;
import java.util.Map;

public class UniqueNumber {
    public static int Brute(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            boolean flag = true;
            for (int j = 0; j < n; j++) {
                if (j!=i && nums[j]==nums[i]){
                    flag = false;
                    break;
                }
            }
            if (flag){
                return nums[i];
            }
        }
        return 0;
    }

    public static int Better(int[] nums) {
        HashMap<Integer,Integer> m= new HashMap<>();
        for (int x:nums){
            m.put(x,m.getOrDefault(x,0)+1);
        }

        for (Map.Entry<Integer,Integer> e:m.entrySet()){
            if (e.getValue()==1){
                return e.getKey();
            }
        }
        return 0;
    }

    public static int Optimal(int[] nums) {
        int ans= 0;
        for (int x:nums){
            ans^=x;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {2,3,5,4,5,3,4};
        int ans1 = Brute(nums);
        int ans2 = Better(nums);
        int ans3 = Optimal(nums);
        System.out.println(ans1);
        System.out.println(ans2);
        System.out.println(ans3);
     }
}
