package PracticeSheet1;

public class LC744 {
    public static char Brute(char[] letters,char target) {
            int n = letters.length;
        for (int i = 0; i < n; i++) {
            if (letters[i]>target){
                return letters[i];
            }
        }
        return letters[0];
    }

    public static char Better(char[] letters,char target) {
        int n = letters.length;
        int start = 0,end = n-1;
        while (start<=end){
            int mid = start+(end-start)/2;
            if (letters[mid]<=target){
                start = mid+1;
            }else {
                end = mid-1;
            }
        }
        return letters[start%n];
    }
    public static void main(String[] args) {
        char[] letters = {'c','f','g'};
        char c = Brute(letters,'c');
        System.out.println(c);
    }
}
