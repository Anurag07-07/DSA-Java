package BitManipulation;

public class UpdateBit {
    public static void main(String[] args) {
        int n = 13;
        int i = 1;
        int set = 1;

        //Create a mask and make ith bit 0 first
        int mask = ~(1<<i);
        int value = n & mask;

        //Set the Bits
         int ans = value |(set<<i);

        System.out.println(ans);
    }
}
