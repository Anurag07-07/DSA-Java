package TwoDArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Basic {
    public static void main(String[] args) {
        //Representation
        //Static Two D Array
        //Declaration
        int[][] matrix2 = new int[3][3];
        //Initialization
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};

        int rows = matrix.length;
        int cols = matrix[0].length;
        System.out.println(rows+" "+cols);

        //Initialization
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        //Dynamic 2D Array
        //Declaration
        List<List<Integer>> mat = new ArrayList<>();

        //Initialization
        List<List<Integer>> mat2 = Arrays.asList(
                Arrays.asList(1,2,3),
                Arrays.asList(4,5,6)
        );

        //Rows
        if (mat2==null || mat2.isEmpty()) return;
        int row1 = mat2.size();
        int col1 = mat2.get(0).size(); //this gives  runtime exception when array is empty

        for (int i = 0; i < mat2.size(); i++) {
            for (int j = 0; j < mat2.get(i).size(); j++) {
                System.out.print(mat2.get(i).get(j)+" ");
            }
            System.out.println();
        }


        //Print Matrix Row Wise and Column Wise

    }
}
