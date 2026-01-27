package Array.Sorting;

import java.util.Arrays;

public class LargestNumber {
    public static void main(String[] args) {
        int[] nums = {3,30,34,5,9};

        Integer[] num = Arrays.stream(nums).boxed().toArray(Integer[]::new);

        Arrays.sort(num,(a,b)->(""+b+a).compareTo(""+a+b));

//        if (num[0]==0) return "0";

        StringBuilder s= new StringBuilder();
        for (int x:num){
            s.append(x);
        }

        return s.toString();
    }
}
