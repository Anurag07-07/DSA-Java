package BinarySearch;

public class KokoEating {
    public static boolean isPossible(int[] num,int speed,int hrs) {
        int value = 0;
        for (int pile:num){
            value+= (pile+(speed-1))/speed;
            if (value>hrs){
                return false;
            }
        }
        return value<=hrs;
    }
    public static void main(String[] args) {
        int[] nums = {3,6,7,11};
        int h = 8;
        int start = 1;
        int end = 0;
        for (int x:nums){
            end = Math.max(end,x);
        }

        int ans = end;
        while (start<=end){
            System.out.println(start+" "+end);
            int mid = start+(end-start)/2;
            if (isPossible(nums,mid,h)){
                ans = mid;
                end = mid-1;
            }else {
                start = mid+1;
            }
        }

        System.out.println(ans);
    }
}
