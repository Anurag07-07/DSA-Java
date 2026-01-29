package Array.TwoDArray;

import java.util.Arrays;

public class Transpose {
    public static void main(String[] args) {
        int[][] nums= {{1,2,3},{4,5,6},{7,8,9}};
        int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < n; j++) {
                int temp =  nums[i][j];
                nums[i][j] = nums[j][i];
                nums[j][i] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(nums[i]));
        }
    }
}
