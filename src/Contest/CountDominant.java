package Contest;

public class CountDominant {
    public static void main(String[] args) {
        int[] nums = {4,1,2};
        int count = 0;
        for (int i = 0; i < nums.length-1; i++) {
            int sum = 0;
            int j = 0;
            for (j = i+1; j < nums.length; j++) {
                    sum += nums[j];
            }
            if (((nums.length-1)-(i))!=0){
                int avg = sum / ((nums.length-1)-(i));
                if (nums[i]>avg){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
