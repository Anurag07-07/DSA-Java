package Array.Sorting;

public class QuickSort {
    public static int partition(int[] arr,int low,int high) {
        int pivot = arr[high];
        int i = low-1;

        for (int j = low; j < high; j++) {
            if (arr[j]<=pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }

    public static int randomPartition(int[] arr,int low ,int high) {
        int pivotIndex = low+(int)(Math.random()*(high-low+1));
        int temp = arr[pivotIndex];
        arr[pivotIndex] = arr[high];
        arr[high] = temp;

        return partition(arr,low,high);
    }

    public static void quickSort(int[] arr,int low,int high) {
        if (low>=high) return;
        int pi = randomPartition(arr,low,high);
        quickSort(arr,low,pi-1);
        quickSort(arr,pi+1,high);
    }
    public static void main(String[] args) {
        int[] arr = {10,80,30,90,40};
    }
}
