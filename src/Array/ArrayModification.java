package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayModification {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,1,1,1,2,2,3,3,3,4,5));

        //Insert in end
        arr.add(10);

        //Insert at Beginning
        arr.add(0,10);

        //Insert at any position
        arr.add(1,50);

        //Delete Element from last
        arr.remove(arr.size()-1);

        //Delete  by Index
        arr.remove(1);

        //Delete by Value(First Occurance)
        arr.remove(Integer.valueOf(1));

        //Delete by Value(All Occurance)
        arr.removeIf(num->num==1);

        //Update at Index
        arr.set(4,1000);

        //Update the Value
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i)==1000){
                arr.set(i,4);
            }
        }

        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
    }
}
