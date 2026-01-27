package Array.TestSolution;

import java.util.*;

public class SectionAQ1 {
    public static void main(String[] args) {
//        HashSet<Integer> h = new HashSet<>();
//
//
//        h.add(45);
//        h.add(55);
//        h.add(65);
//        h.add(75);

        //Tech1
//        Iterator<Integer> s = h.iterator();
//        while (s.hasNext()){
//            System.out.println(s.next());
//        }

//        HashMap<Integer,Integer> hm = new HashMap<>();
//        hm.put(0,1);
//        hm.put(1,2);
//        hm.put(2,3);
//        hm.put(3,4);

//        for (Map.Entry<Integer,Integer> e:hm.entrySet()){
//            System.out.println(e.getKey()+" "+e.getValue());
//        }

//        Iterator<Map.Entry<Integer,Integer>> h = hm.entrySet().iterator();
//        while (h.hasNext()){
//            Map.Entry<Integer,Integer> s = h.next();
//            System.out.println(s.getKey()+" "+s.getValue());
//        }

//        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(3,3,3,3,3,3,1,1,1,1));
//
//        arr.removeIf(num->num==3);
//
//        System.out.println(arr);

//        int[] nums = {0,0,1,1,1,2,2,3,3,4};
//
//        int slow = 1;
//        for (int fast = 1; fast < nums.length; fast++) {
//            if (nums[slow-1]!=nums[fast]){
//                nums[slow] = nums[fast];
//                slow++;
//            }
//        }
//        System.out.println(Arrays.toString(nums));

//        10 5 2 7 1 -10 k = 15;



//        int[] nums = {10,5,2,7,1,-10};
//
//        HashMap<Integer,Integer> hm = new HashMap<>();
//        hm.put(0,-1);
//        int k = 15;
//        int sum = 0;
//        int maxlen = 0;
//
//        for (int i = 0; i < nums.length; i++) {
//            sum += nums[i];
//
////            if (sum==k){
////                maxlen = i+1;
////            }
//
//            if (hm.containsKey(sum-k)){
//                maxlen = Math.max(maxlen,i-hm.get(sum-k));
//            }
//
//            hm.putIfAbsent(sum,i);
//        }
//
//        System.out.println(maxlen);


//        int[] arr =  {1, 2, 3, 4, 5, 1, 2, 3};
//
//        int l = 0;int maxlen = 0;
//        HashSet<Integer> s = new HashSet<>();
//        for (int r = 0; r < arr.length; r++) {
//
//            while (s.contains(arr[r])){
//                s.remove(arr[l]);
//                l++;
//            }
//
//            s.add(arr[r]);
//            maxlen = Math.max(maxlen,r-l+1);
//
//        }
//        System.out.println(maxlen);


    }
}
