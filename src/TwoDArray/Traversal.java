package TwoDArray;

public class Traversal {
    public static void main(String[] args) {

        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};

        int rows2 = matrix.length;
        int cols2 = matrix[0].length;

        //Row Wise Traversal
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        //Column Wise Traversal
        for (int j = 0; j< cols2; j++) {
            for (int i = 0;i < rows2; i++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        //Sum of All Elements of Matrix
        int sum = 0;
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                sum+=matrix[i][j];
            }
        }

        //Reverse Row Wise Traversal
        for (int i = rows2-1; i >= 0; i--) {
            for (int j = 0; j < cols2; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        //Reverse Column Wise Traversal
        for (int i = 0; i < rows2; i++) {
            for (int j = cols2-1; j >= 0; j--) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        //Diagonal Print
        //Must  => Matrix Should be Square
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(matrix[i][i]);
        }

        //AntiDiagonal
        int n = matrix.length;
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(matrix[i][n-i-1]);
        }

        //LC 1470 LC 1572

    }
}
