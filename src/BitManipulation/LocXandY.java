package BitManipulation;

import java.util.Scanner;

public class LocXandY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int ans = (X<<1) | (Y<<1);
        System.out.println(ans);
    }
}
