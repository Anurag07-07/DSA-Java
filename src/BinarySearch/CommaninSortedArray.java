package BinarySearch;

import java.util.ArrayList;
import java.util.HashSet;

public class CommaninSortedArray {
    public static void Brute(int[] nums1,int[] nums2,int[] nums3) {
        //Find Unique in two Arrays and store in hashset
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for (int x:nums1){
            set1.add(x);
        }

        for (int x:nums2){
            if (set1.contains(x)){
                set2.add(x);
            }
        }

        for (int x:nums3){
            if (set2.contains(x)){
                ans.add(x);
            }
        }

        System.out.println(ans);
    }

    public static void Optimal(int[] nums1,int[] nums2,int[] nums3) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int n3 = nums3.length;
        int i = 0,j = 0,k=0;
        ArrayList<Integer> ans = new ArrayList<>();
        while (i<n1 && j<n2 && k<n3){
            if (nums1[i]==nums2[j] && nums2[j]==nums3[k]){
                ans.add(nums1[i] );
                i++;j++;k++;

                //To Remove Duplicate

                while (i>0 && i<n1 && nums1[i]==nums1[i-1]){
                    i++;
                }

                while (j>0 &&j<n2 && nums1[j]==nums1[j-1]){
                    j++;
                }

                while (k>0 && k<n3 && nums1[k]==nums1[k-1]){
                    k++;
                }
            }


           else if (nums1[i]<nums2[j]){
                i++;
            }else if (nums2[j]<nums3[k]){
                j++;
            }else {
                k++;
            }
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        int[] nums1 = {1,5,10,20,30};
        int[] nums2 = {5,13,15,20};
        int[] nums3 = {5,20};

        Brute(nums1,nums2,nums3);
        Optimal(nums1,nums2,nums3);
    }
}
