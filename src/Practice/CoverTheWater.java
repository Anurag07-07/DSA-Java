package Practice;

import java.util.Scanner;

public class CoverTheWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            String s = sc.next();
            boolean flag = true;
            for (int i = 0; i < n-2; i++) {
                if (s.charAt(i)=='.' && s.charAt(i+1)=='.' && s.charAt(i+2)=='.'){
                    flag = false;
                    break;
                }
            }
            if (!flag){
                System.out.println(2);
            }else {
                int count = 0;
                for (char x:s.toCharArray()){
                    if (x=='.'){
                        count++;
                    }
                }
                System.out.println(count);
            }
        }
    }
}
