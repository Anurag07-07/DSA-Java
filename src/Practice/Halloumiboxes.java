package Practice;
import java.util.Scanner;

public class Halloumiboxes {
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        while(a-->0){
            int lengthh = sc.nextInt();
            int k = sc.nextInt();


            int[] arr = new int[lengthh];
            for(int i = 0; i<lengthh; i++){
                arr[i] = sc.nextInt();
            }

            boolean issoretd = true;
            for(int i = 0; i<lengthh-1;i++){
                if(arr[i] > arr[i+1]){
                    issoretd = false;
                }
            }

            if (issoretd){
                System.out.println("YES");
            }else if(k<=1){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }

        }
    }
}