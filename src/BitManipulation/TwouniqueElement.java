package BitManipulation;

import java.util.ArrayList;

public class TwouniqueElement {

    public static int getBits(int n,int i) {
        int ans = n & (1<<i);
        return ans == 0 ? 0 :1  ;
    }
    public static void main(String[] args) {
        int[] nums = {2,5,7,7,9,5,3,2};

        //Take  Xor of Each element
        int left = 0;
        for (int x:nums){
            left^=x;
        }

        //Create partition on the  basis of 1 set bit position
        int temp = left;
        int pos = 0;
        while ((temp&1)==0){
            pos++;
            temp = temp>>1;
        }

        //Create Two Array
        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> B = new ArrayList<>();

        for (int x:nums){
            if (getBits(x,pos)==1){
                A.add(x);
            }else{
                B.add(x);
            }
        }

        //Take a Xor of It
        int ans1 = 0;
        int ans2 = 0;
        for (int a:A){
            ans1^=a;
        }
        for (int b:B){
            ans2^=b;
        }

        System.out.println(ans1+" "+ans2);
    }
}
