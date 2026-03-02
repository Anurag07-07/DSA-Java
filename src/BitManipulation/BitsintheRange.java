package BitManipulation;

public class BitsintheRange {
    public static void main(String[] args) {
        int n = 31;
        int j = 3;
        int i = 1;
        int mask1 = 1<<(j+1);
        int mask2 = (1<<i)-1;
        int mask3 = mask1 | mask2;
        int ans = n&mask3;
        System.out.println(ans);
    }
}
