package BitManipulation;

public class SubarrayswithBitwiseOR1 {
    public static void main(String[] args) {
        int[] B = {1,0,1};
        int A = B.length;
        long total = ((A*(A+1))/2);
        int consecutive_zero = 0;
        int zero_sub = 0;
        for (int i = 0; i < A; i++) {
            if (B[i]==0){
                consecutive_zero++;
            }else{
                //Count The Subarrays
                zero_sub += (consecutive_zero*(consecutive_zero+1))/2;
                consecutive_zero = 0;
            }
        }

        zero_sub += (consecutive_zero*(consecutive_zero+1))/2;

        System.out.println(total-zero_sub);
    }
}
