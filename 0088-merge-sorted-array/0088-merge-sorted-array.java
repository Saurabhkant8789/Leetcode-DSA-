class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int sau = m-1;
        int tan = n-1;
        int ans = nums1.length - 1;
        while(sau >=0 && tan >=0){
            if(nums2[tan] >= nums1[sau]){
                nums1[ans] = nums2[tan];
                tan --;
                ans --;
            }
            else {
                nums1[ans] = nums1[sau];
                sau--;
                ans--;
                  }
        }
            while(tan>=0){
                nums1[ans] = nums2[tan] ;
                tan--;      
                ans--;
    }

    }
}
    