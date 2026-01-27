package Array.Sorting;

import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public String frequencySort(String s) {
        //Create a Freq Array
        int[] freq = new int[128];

        //Calculate the Freq count
        for (char c:s.toCharArray()){
            freq[c]++;
        }

        //Create  Bucket Array where we store which chracter how much times
//        Maximum possible freq  = s.length + 1
        //Bucket Size
        StringBuilder[] bucket = new StringBuilder[s.length()+1];

        for (int i = 0; i < 128; i++) {
            if (freq[i]>0){
                int f = freq[i];

                if (bucket[f]==null){
                    bucket[f] = new StringBuilder();
                }

                bucket[f].append((char) i);
            }
        }

        StringBuilder result = new StringBuilder();
        for (int i = s.length(); i>= 0 ; i--) {
            if (bucket[i]!=null){
                for (char c:bucket[i].toString().toCharArray()){
                    for (int j = 0; j < i; j++) {
                        result.append(c);
                    }
                }
            }
        }
        return result.toString();
    }
}


public class SortCharctersByFreq {
    public static void main(String[] args) {
       String s = "tree";
       Solution a = new Solution();
       String ans = a.frequencySort(s);
        System.out.println(ans);
    }
}
