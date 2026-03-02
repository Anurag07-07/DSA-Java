package BitManipulation;

public class GetIthBit {
    public static int getIthBit(int no,int i) {
        //Move the Bits right i times and  than take with one
//        int ans = (no>>i)&1;
//        return  ans;

        //Masking Approach
//        Take 1 and move i postion left and than take & with that postion to know waht the actual bit is
        int mask = (1<<i);
        int ans = no&mask;
        return ans == 0 ? 0 : 1;
    }

    public static int SetBits(int no,int i,int pos) {
        //Create a mask of 1 and shift the 1 pos number of times
        int mask = 1<<pos;
        return  no | mask;
    }

    public static int UnsetBit(int no,int i) {
        int mask = 1<<i;
        return mask^no;
    }
    public static void main(String[] args) {
//        1011
        int n = 11;
        int i = 1;
//        int ans = getIthBit(n,i);
//        int ans = SetBits(n,i,2);
        int ans = UnsetBit(n,i);
        System.out.println(ans);
    }
}
