package Array;

public class ProblemSet2 {
    public static int firstOccurance(int[] nums,int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==target){
                return i;
            }
        }
        return -1;
    }

    public static int lastOccurance(int[] nums,int target) {
        for (int i = nums.length-1; i >=0 ; i--) {
            if (nums[i]==target){
                return i;
            }
        }
        return -1;
    }

    public static int firstOccuranceB(int[] nums,int target) {
        int low = 0,high = nums.length-1;
        int first = -1;
        while (low<=high){
            int mid = low+(high-low)/2;
            if (nums[mid]==target){
                first = mid;
                high = mid-1;
            } else if (nums[mid]>target) {
                high = mid-1;
            }else {
                low = mid+1;
            }
        }
        return  first;
    }

    public static int lastOccuranceB(int[] nums,int target) {
        int low = 0,high = nums.length-1;
        int last = -1;
        while (low<=high){
            int mid = low+(high-low)/2;
            if (nums[mid]==target){
                last = mid;
                low = mid+1;
            } else if (nums[mid]>target) {
                high = mid-1;
            }else {
                low = mid+1;
            }
        }
        return last;
    }

    public static int lowerBound(int[] arr,int key) {
        int low = 0,high = arr.length;
        int ans = arr.length;
        while (low<high){
            int mid = low +(high-low)/2;
            if (arr[mid]>=key){
                ans = mid;
                high = mid;
            }else {
                low=  mid+1;
            }
        }
        return ans;
    }

    public static int upperBound(int[] arr,int key) {
        int low = 0,high = arr.length;
        int ans = arr.length;
        while (low<high){
            int mid = low+(high-low)/2;
            if (arr[mid]>key){
                ans = mid;
                high = mid;
            }else {
                low = mid+1;
            }
        }
        return ans;
    }

    public static int sqrtNumber(int n) {
        int low = 1,high = n;
        int ans = high;
        while (low<=high){
            int mid = low+(high-low)/2;
            if(mid*mid<=n){
                ans = mid;
                low = mid+1;
            }else {
                high = mid-1;
            }
        }
        return ans;
    }

    public static void Occurance(int[] arr,int target) {

//        int first = firstOccurance(arr,target);
//        int last = lastOccurance(arr,target);

//        int first = firstOccuranceB(arr,target);
//        int last = lastOccuranceB(arr,target);

//        int lower = lowerBound(arr,target);
//        int upper = upperBound(arr,target);
//        System.out.println("The Total Occurance"+" "+Math.abs(lower-upper));

        System.out.println(sqrtNumber(1));
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,2,3,3,3,4,4,4};
        Occurance(arr,2);
    }
}
