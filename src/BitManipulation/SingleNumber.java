package BitManipulation;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums  = {1,2,2,3,1};
        int ans = 0;
        for (int x:nums){
            ans = ans^x;
        }
        System.out.println(ans);
    }
}
