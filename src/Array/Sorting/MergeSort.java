package Array.Sorting;

public class MergeSort {

    private static void merge(int[] arr,int low,int mid,int high) {
        int[] temp = new int[high-low+1];
        int i = low,j = mid+1,k=0;
        while (i<=mid && j<=high){
            if (arr[i]>=arr[j]){
                temp[k++] = arr[j++];
            }else {
                temp[k++] = arr[i++];
            }
        }

        while (i<=mid){
            temp[k++] = arr[i++];
        }

        while (j<=high){
            temp[k++] = arr[j++];
        }

        for (int x = 0; x < temp.length; x++) {
            arr[x+low] = temp[x];
        }
    }

    private static void mergeSort(int[] arr,int low,int high) {
        if (low>=high) return;

        int mid = low+(high-low)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }

    public static void main(String[] args) {
        int[] nums = {1,3,5,4,6,4,5,6,4,8};
        mergeSort(nums,0,nums.length-1);
    }
}
