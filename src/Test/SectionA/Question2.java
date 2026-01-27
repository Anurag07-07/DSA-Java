package Test.SectionA;

import java.util.ArrayList;
import java.util.Arrays;

public class Question2 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(3,3,3,3,3,3,1,1,1,1));
        arr.removeIf(num->num==3);

        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i)+" ");
        }
    }
}
