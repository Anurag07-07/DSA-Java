package BitManipulation;

public class BitCompression {
    public static void main(String[] args) {
        int[] nums = {1,1,1};
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                int value1 = nums[i];
                int value2 = nums[j];
                nums[i] = (value1 & value2);
                nums[j] = (value1 | value2);
            }
        }

        int xor = 0;
        for (int x:nums){
            xor = xor^x;
        }
        System.out.println(xor);
    }
}
