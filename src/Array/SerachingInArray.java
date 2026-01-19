package Array;

public class SerachingInArray {
    public static boolean linearSearch(int[] nums,int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==target){
                return  true;
            }
        }
        return false;
    }

    public static int binarySearch(int[] nums,int target) {
        int low = 0,high = nums.length-1;
        while (low<=high){
            int mid = low+(high-low)/2;
            if (nums[mid]==target){
                return  mid;
            }else if (nums[mid]>target){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
       int[] arr = {1,2,3,4,5};
       if (linearSearch(arr,4)){
           System.out.println("Present");
       }else {
           System.out.println("Not Present");
       }

       if (binarySearch(arr,7)!=-1){
           System.out.println("Present");
       }else {
           System.out.println("Not Present");
       }
    }
}
