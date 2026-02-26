package BitManipulation;

import java.util.Scanner;

public class ReverseBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int reverse = 0;
        for (int i = 0; i < 32; i++) {
            int last_bit = n&1;
            reverse = (reverse<<1) | last_bit;
            n = n>>1;
        }

        System.out.println(reverse);
    }
}
