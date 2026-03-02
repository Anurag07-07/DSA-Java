package BitManipulation;

public class uniqueNumber {
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,3,3,4,4,5};
        int ans = 0;
        for (int x:nums){
            ans^=x;
        }
        System.out.println(ans);
    }
}
