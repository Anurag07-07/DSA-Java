package Arrays.Easy;

public class StockBuyandSell {
    public static int Brute(int[] nums,int start,int end) {
        if (start>=end) return 0;
        int profit = 0;
        for (int i = start; i <end; i++) {
            for (int j = i+1; j <= end; j++) {
                if (nums[j]>nums[i]){
                   int sum = (nums[j]-nums[i])+Brute(nums,start,i-1)+Brute(nums,j+1,end);
                   profit = Math.max(profit,sum);
                }
            }
        }
        return profit;
    }

    //Better Find the Local Maxima and Minima
    public static int Better(int[] nums) {
        int n = nums.length;
        int Local_Maxima = nums[0];
        int Local_Minima = nums[0];
        int i = 0;
        int sum = 0;
        while (i<n-1){
            while (i<n-1 && nums[i]>=nums[i+1]){
                i++;
            }
            Local_Minima = nums[i];
//               i
//            40 595 695
//            local_minima = 40
//            local_maxima = 695
            while (i<n-1 && nums[i]<=nums[i+1]){
                i++;
            }
            Local_Maxima = nums[i];

            sum+=(Local_Maxima-Local_Minima);
        }
        return sum;
    }

    public static int Optimal(int[] nums) {
        int sum = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i]-nums[i-1]>0){
                sum+=(nums[i]-nums[i-1]);
            }
        }
        return sum;
    }
    public static void main(String[] args) {
       int[] prices = {100, 180, 260, 310, 40, 535, 695};
       int ans = Optimal(prices);
//       int ans = Better(prices);
//       int ans = Brute(prices,0, prices.length-1);
        System.out.println(ans);
    }
}
