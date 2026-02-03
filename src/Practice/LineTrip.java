package Practice;

import java.util.Scanner;

public class LineTrip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }

            int max = 0;
            max = Math.max(max,nums[0]);
            for (int i = 1; i < n; i++) {
                max = Math.max(max,nums[i]-nums[i-1]);
            }
            max = Math.max(max,(x-nums[n-1])*2);

            System.out.println(max);
        }
    }
}
