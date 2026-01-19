package Array;

public class ArrayTraversal {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};


        //Simple Loop Traversal
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        //Reverse Traversal
        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        int left = 0;int right = arr.length-1;
        while (left<right){
            System.out.println(arr[left]+" "+arr[right]);
            left++;
            right--;
        }
    }
}
