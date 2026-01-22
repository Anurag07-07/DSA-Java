package Array.Hashing;

import java.util.HashSet;

public class HashsetDS {
    public static boolean ContainsDuplicates(int[] nums) {
        HashSet<Integer> h = new HashSet<>();
        for (int x:nums){
            if (h.contains(x)){
                return true;
            }
            h.add(x);
        }
        return false;
    }

    public static int lengthOfLongestSubstring(String s) {
          HashSet<Character> h = new HashSet<>();
          int l = 0,len = 0;
        for (int r = 0; r < s.length(); r++) {

            while (h.contains(s.charAt(r))){
                h.remove(s.charAt(l));
                l++;
            }

            h.add(s.charAt(r));
            len = Math.max(len,r-l+1);
        }
        return len;
    }
    public static void main(String[] args) {

    }
}
