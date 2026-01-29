package Array.TwoDArray;

public class Diagonal {
    public static void main(String[] args) {
        int[][] nums = {{1,2,3},{4,5,6},{7,8,9}};

        int n = nums.length;
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i][i]+" ");
        }

        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.print(nums[i][n-1-i]+" ");
        }


    }
}
