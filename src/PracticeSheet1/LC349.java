package PracticeSheet1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class LC349 {
    public int[] intersectionBrute(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        HashSet<Integer> ans = new HashSet<>();
        for(int i = 0;i<n1;i++){
            for(int j = 0;j<n2;j++){
                if(nums1[i]==nums2[j]){
                    ans.add(nums1[i]);
                }
            }
        }

        ArrayList<Integer> arr = new ArrayList<>(ans);

        int[] ans1 = new int[arr.size()];
        int j = 0;
        for(int x:arr){
            ans1[j++] = x;
        }

        return ans1;
    }

    public int[] intersectionBetter(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0;
        int j = 0;
        HashSet<Integer> set = new HashSet<>();
        while(i< nums1.length && j< nums2.length){
            if (nums1[i]>nums2[j]){
                j++;
            } else if (nums1[i]<nums2[j]) {
                i++;
            }else {
                set.add(nums1[i]);
                i++;
                j++;
            }
        }

        ArrayList<Integer> arr = new ArrayList<>(set);

        int[] ans1 = new int[arr.size()];
        int k = 0;
        for(int x:arr){
            ans1[k++] = x;
        }

        return  ans1;
    }

    public int[] intersectionOptimal(int[] nums1, int[] nums2) {
        HashSet<Integer> h1 = new HashSet<>();
        HashSet<Integer> h2 = new HashSet<>();

        for (int x:nums1){
            h1.add(x);
        }

        for (int x:nums2){
            h2.add(x);
        }

        ArrayList<Integer> arr = new ArrayList<>();
        for (int x:h1){
            if (h2.contains(x)){
                arr.add(x);
            }
        }



        int[] ans1 = new int[arr.size()];
        int j = 0;
        for(int x:arr){
            ans1[j++] = x;
        }

        return  ans1;
    }



    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
    }
}
