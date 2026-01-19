package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class WhatisArray {
    public static void main(String[] args) {
        //Static Size Allocation
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        System.out.println(Arrays.toString(arr));

        //Dynamic Size Array
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(10);
        arr1.add(20);
        arr1.add(30);
        arr1.add(40);
        arr1.add(50);
        for (int i = 0; i < arr1.size(); i++) {
            System.out.print(arr1.get(i)+" ");
        }

        System.out.println();

        //Access
        int x = arr[0];
        System.out.println(x);

        //Update
        arr[1] = 100;
        System.out.println(Arrays.toString(arr));

//        System.out.println(arr[-1]); //Give Out of Bound Error
    }
}
