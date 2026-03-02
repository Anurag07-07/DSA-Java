package BitManipulation;

import java.util.Scanner;

public class UnsetBitsx {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int mask = -1<<b;
            int num = a&mask;
            System.out.println(num);
        }
    }
}
