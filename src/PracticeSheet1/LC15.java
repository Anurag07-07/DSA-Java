package PracticeSheet1;

import java.util.*;

public class LC15 {
    public static List<List<Integer>> Brute(int[] nums) {
        HashSet<List<Integer>> set = new HashSet<>();
        int n = nums.length;
        for (int i = 0; i <= n-3; i++) {
            for (int j = i+1; j <= n-2; j++) {
                for (int k = j+1; k <= n-1; k++) {
                    if (nums[i]+nums[j]+nums[k]==0){
                        List<Integer> arr = new ArrayList<>();
                        arr.add(nums[i]);
                        arr.add(nums[j]);
                        arr.add(nums[k]);
                        Collections.sort(arr);
                        set.add(arr);
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }

    public List<List<Integer>> threeSum(int[] nums) {
        //Hashset is used for storing in non duplicate pair
        HashSet<List<Integer>> ans = new HashSet<>();

        //Sort the Array to not same index
        Arrays.sort(nums);

        int n = nums.length;
        //Take each element
        for(int i = 0;i<=n-3;i++){
            //Now as we have to find the triplet we get one value a-(something) = 0 we have something left  to find
            //But what is something basically it a pair of two element with value equals -(nums[i])
            //For That we use Hashset to find the pair of element target equal to something
            int target = -nums[i];
            HashSet<Integer> h = new HashSet<>();
            for(int j = i+1;j<n;j++){
                int comp = target-nums[j];
                if(h.contains(comp)){
                    ArrayList<Integer> a = new ArrayList<>(Arrays.asList(nums[i],comp,nums[j]));
                    ans.add(a);
                }
                h.add(nums[j]);
            }
        }
        return new ArrayList<>(ans);
    }

    public List<List<Integer>> threeSumOptimal(int[] nums) {
        //Hashset is used for storing in non duplicate pair
        HashSet<List<Integer>> ans = new HashSet<>();

        //Sort the Array to not same index
        Arrays.sort(nums);


        int n = nums.length;
        //Take each element
        for(int i = 0;i<=n-3;i++){
            if ( i>0 &&  nums[i]==nums[i-1]) continue;
            int j = i+1;int k = n-1;
            while (j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if (sum==0){
                    ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[k]));
                    ans.add(arr);

                    while (j<k && nums[j]==nums[j+1]) j++;
                    while (j<k && nums[k]==nums[k-1]) k--;
                   //Think waht if there is no duplicate will while ever run  ?
                    j++;k--;
                }else if (sum<0){
                    j++;
                }else {
                    k--;
                }
            }
        }
        return new ArrayList<>(ans);
    }

    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        Brute(nums);
    }
}
