package BinarySearch;

import java.util.Arrays;

public class AggressiveCows {
    public static boolean canPlace(int[] stalls,int k,int dist) {
        int cow = 1;
        int last = stalls[0];
        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i]-last>=dist){
                cow++;
                last = stalls[i];
            }
            if (cow==k) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] stalls= {1, 2, 4, 8, 9};
        int k = 3;
        //First find the range
        Arrays.sort(stalls);
        int start = 1;
        int end  = stalls[stalls.length-1]-stalls[0];
        int ans = 0;
        while (start<=end){
            int mid = start+(end-start)/2;
            if (canPlace(stalls,k,mid)){
                ans = mid;
                start = mid+1;
            }else {
                end = mid-1;
            }
        }
    }
}
