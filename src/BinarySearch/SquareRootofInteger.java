package BinarySearch;

public class SquareRootofInteger {
    public static int Brute(int n) {
        /*
        * Intution
        * Increase the value of i  till we not get the square of it greater than n
        * If we get value greater than n we return i-1
        * */
        int  i = 1;
        while (i*i<=n){
            i++;
        }

        return i-1;
    }

    public static int Better(int n) {
        /*
        * We take start = 1 and end  = n
        * Now we find the possible answer by taking mid
        * if mid*mid is equal to n this is answer
        * if mid*mid is greater than n  we know that on right hand side there is no element which mid mid square less than n
        * so we have to search on left hand side
        *If we get mid square is less than target then this is the possible answer so we store it and search that element on right side
        *
        * */

        if (n<1){
            return n;
        }

        int start = 1,end = n;
        int ans = 0;
        while (start<=end){
            int mid = start+(end-start)/2;
            if (mid==n/mid){
                return mid;
            } else if (mid>n/mid) {
                end = mid-1;
            }else {
                ans = mid;
                start = mid+1;
            }
        }
        return  ans;
    }

    public static void main(String[] args) {
        int n = 4;
        int ans = Brute(n);
        System.out.println(ans);
    }
}
