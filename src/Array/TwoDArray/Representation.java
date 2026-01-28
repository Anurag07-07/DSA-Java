package Array.TwoDArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Representation {

    public static void Print(List<List<Integer>> nums) {
        if (nums==null || nums.isEmpty()) return;

        int rows = nums.size();
        int cols = nums.get(0).size();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(nums.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }

    public static void matrixSum(List<List<Integer>> nums) {
        Integer sum = 0;
        if (nums==null || nums.isEmpty()) return;

        int rows = nums.size();
        int cols = nums.get(0).size();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum += nums.get(i).get(j);
            }
        }
        System.out.println("The Total Sum is "+sum);
    }

    public static void main(String[] args) {
//        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
//        System.out.println(arr[1][2]);

        List<List<Integer>> arr = Arrays.asList(
                Arrays.asList(1,2,3),
                Arrays.asList(4,5,6)
        );

//        if (arr == null || arr.isEmpty()) return;
//
//        System.out.println(arr.get(0).get(2));
//        System.out.println("Number of Rows "+(arr.size()));
//        System.out.println("Number of Colums "+(arr.get(0).size()));

//        Print(arr);
        matrixSum(arr);
    }
}
