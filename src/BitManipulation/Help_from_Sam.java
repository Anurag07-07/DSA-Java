package BitManipulation;

public class Help_from_Sam {
    public static void main(String[] args) {
        int val = 1;
        int n = 32;
        while(val<=n){
            val = val*2;
        }
        val/=2;
        System.out.println("Sam Help :"+((n-val)+1));
    }
}
