package Maodular;

import java.util.Scanner;

public class Divisibleby8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-->0){
            String s = sc.next();
            int sz = s.length();
            String data = ""+(s.charAt(sz-2)-'0')+(s.charAt(sz-1)-'0');
            int d = Integer.parseInt(data);
            if (d%8==0){
                System.out.println(1);
            }else {
                System.out.println(0);
            }
        }
    }
}
