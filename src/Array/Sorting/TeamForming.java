package Array.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class TeamForming {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums  = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Arrays.sort(nums);

        int count = 0;
        for (int i = 0; i < n-1; i = i +2) {
            count+=(nums[i+1]-nums[i]);
        }

        System.out.println(count);
    }
}
