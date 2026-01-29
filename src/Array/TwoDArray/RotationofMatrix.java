package Array.TwoDArray;

import java.util.Arrays;

public class RotationofMatrix {
    public static void Transpose(int[][] nums) {
        int rows = nums.length;
        for (int i = 0; i < rows; i++) {
            for (int j = i; j < rows; j++) {
                int temp = nums[i][j];
                nums[i][j] = nums[j][i];
                nums[j][i] = temp;
            }
        }
    }

    public static void RowRotation(int[][] nums) {
        int rows = nums.length;

        for (int i = 0; i < rows; i++) {
            int start = 0;int end = rows-1;
            while(start<end){
                int temp = nums[i][start];
                nums[i][start] = nums[i][end];
                nums[i][end] = temp;
                start++;end--;
            }
        }
    }

    public static void ColumnRotation(int[][] nums) {
        int cols = nums[0].length;

        for (int i = 0; i < cols; i++) {
            int start = 0;int end = cols-1;
            while(start<end){
                int temp = nums[start][i];
                nums[start][i] = nums[end][i];
                nums[end][i] = temp;
                start++;end--;
            }
        }
    }
    public static void main(String[] args) {
        int[][] nums = {{1,2,3},{4,5,6},{7,8,9}};
        //Rotation Only Possible in Square Matrix
        int n = nums.length;

        //90 degree rotation
//        Transpose(nums);
//        RowRotation(nums);

//       270 degree rotation
//         Transpose(nums);
//         ColumnRotation(nums);

//        180 Rotation

        RowRotation(nums);
        ColumnRotation(nums);

        for (int i = 0; i < nums.length; i++) {
            System.out.println(Arrays.toString(nums[i]));
        }
    }
}
