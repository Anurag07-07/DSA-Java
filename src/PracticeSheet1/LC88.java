package PracticeSheet1;

public class LC88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // int i = 0,j = 0;
        // int k = 0;
        // int[] res = new int[m+n];
        // while(i<m && j<n){
        //     if(nums1[i]<nums2[j]){
        //         res[k++] = nums1[i++];
        //     }else{
        //         res[k++] = nums2[j++];
        //     }
        // }
        // while(i<m){
        //     res[k++] = nums1[i++];
        // }

        // while(j<n){
        //     res[k++] = nums2[j++];
        // }

        // int p = 0;
        // for(int x:res){
        //     nums1[p++] = x;
        // }


        int i = m-1;
        int j = n-1;
        int k = nums1.length-1;

        while(i>=0 && j>=0){
            if(nums1[i]>nums2[j]){
                nums1[k--] = nums1[i--];
            }else{
                nums1[k--] = nums2[j--];
            }
        }

        while(i>=0){
            nums1[k--] = nums1[i--];
        }

        while(j>=0){
            nums1[k--] = nums2[j--];
        }

    }
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
    }
}
