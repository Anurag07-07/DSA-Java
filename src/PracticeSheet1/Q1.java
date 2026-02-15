package PracticeSheet1;

public class Q1 {
    public static void main(String[] args) {
        String[] words = {"abcd","def","xyz"};
        int[] weights = {5,3,12,14,1,2,3,2,10,6,6,9,7,8,7,10,8,9,6,9,9,8,3,7,7,2};
        int n = words.length;
        StringBuilder s = new StringBuilder();
        for(int i = 0;i<n;i++){
            //Find The Sum of String
            int sum = 0;
            for(char c:words[i].toCharArray()){
                sum+=weights[(c-'a')];
            }
            int mod = sum%26;
            char x = (char)('a'+25-mod);
            s.append(x);
        }
        System.out.println(s.toString());
    }
}