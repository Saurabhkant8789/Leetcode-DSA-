class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int [] store = new int [nums1.length+nums2.length];
        System.arraycopy(nums1,0,store,0,nums1.length);
        System.arraycopy(nums2,0,store,nums1.length,nums2.length);
        Arrays.sort(store);
        
        if(store.length%2==0){
            return (double) ((double)store[store.length/2]+(double)store[store.length/2 -1])/2;
        }
        return (double) store[store.length/2];
    }
}