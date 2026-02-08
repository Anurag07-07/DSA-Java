package BinarySearch;

public class BinaryRecursive {
    public static int BinaryRecus(int[] nums,int start,int end,int x) {
        if (end>=start){
            int mid= start+(end-start)/2;
            if (nums[mid]==x){
                return mid;
            }

            if (nums[mid]>x) return  BinaryRecus(nums,0,mid-1,x);

            return  BinaryRecus(nums,mid-1, nums.length-1,x );
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {2,5,8,12,16,23,38,56,72,91};
        int start = 0,end = nums.length-1;
        int ans = BinaryRecus(nums,start,end,56);
        System.out.println(ans);
    }
}
