package Maodular;

import java.util.Scanner;

public class ABModulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){

        int a = sc.nextInt();
        int b  = sc.nextInt();

        for (int i = Math.min(a,b); i >= 1; i--) {
                if ((a%i)==(b%i)){
                    System.out.println(i);
                    break;
                }
            }
        }

    }
}
