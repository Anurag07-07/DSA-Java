package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Basics {
    public static void main(String[] args) {
//        ArrayList<String> arr1 = new ArrayList<>();
//        ArrayList<String> arr2 = new ArrayList<>();
//
//        //add Element
////        arr.add(1);
//
//        //remove element by index
////        arr.remove(0);
//
//        arr1.add("Geeks");
//        arr1.add("Geeks");
//        arr1.add("Geeks");
//        arr1.add("Geeks");
//        arr1.add("Geeks");
////        arr1.clear();
//
//
//        System.out.println(arr1);
//        arr2.addAll(arr1);

//        arr.remove(0);
//        arr.set(0,"Anurag");


//        System.out.println(arr2);

        List<Integer> arr = new ArrayList<Integer>(Arrays.asList(1,1,1,1,1,1,1,2));
        System.out.println(arr.indexOf(1));
        System.out.println(arr.lastIndexOf(1));
        //remove all elment
//        arr.removeAll(arr);
        //Remove all elemnet on given condition
//        arr.removeIf(num->num==1);
        //Remove element from the range
        Integer[] arr1 = new Integer[arr.size()];
        arr1 = arr.toArray(arr1);
        System.out.println(Arrays.toString(arr1));
    }
}
