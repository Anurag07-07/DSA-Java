package Practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DoremyPaint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int  n = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }

            HashMap<Integer,Integer> hm = new HashMap<>();
            for (int x:nums){
                hm.put(x,hm.getOrDefault(x,0)+1);
            }

            if (hm.size()==1){
                System.out.println("Yes");
                continue;
            }

            if (hm.size()>=3){
                System.out.println("No");
            }else {

            ArrayList<Integer> arr = new ArrayList<>();
            for (Map.Entry<Integer,Integer> e:hm.entrySet()){
                arr.add(e.getValue());
            }

            int first = arr.get(0);
            int second = arr.get(1);

            if (second==first){
                System.out.println("Yes");
            } else if ( n%2==1 &&  Math.abs(second-first)==1) {
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
           }
        }
    }
}
