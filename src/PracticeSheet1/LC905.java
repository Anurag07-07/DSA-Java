package PracticeSheet1;

public class LC905 {
    public static void swap(int[] nums,int start,int end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
    public int[] sortArrayByParity(int[] nums) {
        // ArrayList<Integer> even = new ArrayList<>();
        // ArrayList<Integer> odd = new ArrayList<>();

        // for(int x:nums){
        //     if(x%2==0){
        //         even.add(x);
        //     }else{
        //         odd.add(x);
        //     }
        // }

        // int m = 0;
        // for(int x:even){
        //     nums[m++] = x;
        // }

        // for(int x:odd){
        //     nums[m++] = x;
        // }

        // return nums;
        // int n = nums.length;
        // int i= 0,j = n-1;
        // while(i<j){
        //     while( i<n && nums[i]%2!=1) i++;
        //     while( j>= 0 && nums[j]%2!=0) j--;
        //     if(i<j){
        //         swap(nums,i,j);
        //         i++;j--;
        //     }
        // }
        // return nums;

        int n = nums.length;
        int s = 0;
        for(int f= 0;f<n;f++){
            if(nums[f]%2==0){
                int temp = nums[f];
                nums[f] = nums[s];
                nums[s] = temp;
                s++;
            }
        }
        return nums;
    }
}
