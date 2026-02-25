package BitManipulation;

public class BinaryString {
    public static void main(String[] args) {
        String s1 = "100";
        String s2 = "11";
        int i = s1.length()-1;
        int j = s2.length()-1;
        String ans = "";
        int carry = 0;
        while(i>=0 && j>=0){
            int a = Integer.parseInt(String.valueOf(s1.charAt(i)));
            int b = Integer.parseInt(String.valueOf(s2.charAt(j)));
            int total = a+b+carry;
            if (total>2){
                carry = 1;
                ans = "1"+ans;
            } else if (total==2) {
                carry = 1;
                ans = "0"+ans;
            }else if (total==1) {
                carry = 0;
                ans = "1"+ans;
            }else {
                carry = 0;
                ans = "0"+ans;
            }
            i--;j--;
        }
        if (j<0){
            while(i>=0){
                int a = Integer.parseInt(String.valueOf(s1.charAt(i)));
                int total = a+carry;
                if (total==2) {
                    carry = 1;
                    ans = "0"+ans;
                }else if (total==1) {
                    carry = 0;
                    ans = "1"+ans;
                }else {
                    carry = 0;
                    ans = "0"+ans;
                }
                i--;
            }
        }else {
            while(j>=0){
                int b = Integer.parseInt(String.valueOf(s2.charAt(j)));
                int total = b+carry;
                if (total==2) {
                    carry = 1;
                    ans = "0"+ans;
                }else if (total==1) {
                    carry = 0;
                    ans = "1"+ans;
                }else {
                    carry = 0;
                    ans = "0"+ans;
                }
                j--;
            }
        }
        if (carry==1){
            ans = "1"+ans;
        }
        System.out.println(ans);
    }
}
