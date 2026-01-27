package Test.SectionA;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Question1 {
    public static void Traversal(int[] arr) {
        //Technique 1
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (Map.Entry<Integer,Integer> e:hm.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }

        //Technique 2
        Iterator<Map.Entry<Integer,Integer>> h = hm.entrySet().iterator();
        while(h.hasNext()){
            Map.Entry<Integer,Integer> k = h.next();
            System.out.println(k.getKey()+" "+k.getValue());
        }
    }

    public static void Frequency(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int x:nums) {
            hm.put(x, hm.getOrDefault(x, 0) + 1);
        }

            int value = -1;
            for (Map.Entry<Integer,Integer> e : hm.entrySet()){
                if (e.getValue()> (nums.length/3)){
                    value = e.getKey();
                }
            }
        System.out.println(value);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,4,4,4,4};
        Frequency(arr);
    }
}
