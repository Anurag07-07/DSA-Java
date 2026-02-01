package Arrays;

import java.util.*;

public class RemoveDuplicates {
    public static void Brute(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];
            if (!arr.contains(value)){
                arr.add(value);
            }
        }

        for (int i = 0; i < arr.size(); i++) {
            nums[i] = arr.get(i);
        }

        System.out.println(Arrays.toString(nums));
    }

    public static void Better(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            int value = nums[i];
            if (arr.size()>0 && arr.get(arr.size()-1)!=value){
                arr.add(value);
            }
        }

        for (int i = 0; i < arr.size(); i++) {
            nums[i] = arr.get(i);
        }

        System.out.println(Arrays.toString(nums));
    }

    public static void Better2(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int x:nums){
            set.add(x);
        }

        ArrayList<Integer> arr = new ArrayList<>(set);

        Collections.sort(arr);

        for (int i = 0; i < arr.size(); i++) {
            nums[i] = arr.get(i);
        }

        System.out.println(Arrays.toString(nums));
    }

    public static void Optimal(int[] nums) {
        int slow = 1;
        int n = nums.length;
        for (int fast = 0; fast < n; fast++) {
            if (nums[slow-1]!=nums[fast]){
                nums[slow++] = nums[fast];
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 4, 5, 5};
//        Brute(arr);
        Better2(arr);
    }
}
