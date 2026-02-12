package PracticeSheet1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class LC350 {
    public static int[] Brute(int nums1[],int nums2[]) {
        boolean[] visited = new boolean[nums2.length];
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i]==nums2[j] && !visited[j]){
                    arr.add(nums2[j]);
                    visited[j]=true;
                    break;
                }
            }
        }

        int k = 0;
        int[] ans = new  int[arr.size()];
        for (int x:arr){
            ans[k++] = x;
        }

        return ans;
    }

    public static int[] Optimal(int nums1[],int nums2[]) {
        HashMap<Integer,Integer> h = new HashMap<>();
        for (int x:nums1){
            h.put(x,h.getOrDefault(x,0)+1);
        }

        ArrayList<Integer> arr = new ArrayList<>();
        for (int x:nums2){
            if (h.containsKey(x)){
                h.put(x,h.get(x)-1);
                arr.add(x);
                break;
            }
        }

        int k = 0;
        int[] ans = new  int[arr.size()];
        for (int x:arr){
            ans[k++] = x;
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        Brute(nums1,nums2);

    }
}
