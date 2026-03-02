package BitManipulation;

public class InterestingArray {
    public static void main(String[] args) {
        int[] nums = {9,17};
        int ans = 0;
        for (int x:nums){
            ans = ans^x;
        }

        if (ans%2==0){
            System.out.println("True");
        }else {
            System.out.println("No");
        }
    }
}
