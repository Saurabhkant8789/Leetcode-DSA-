class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i =0;
        int j=0;
        int[] store = new int[nums1.length+nums2.length];
        int index =0;
        while (i<nums1.length && j<nums2.length){
            if(nums1[i] <= nums2[j]){
                store[index] = nums1[i];
                i++;
                index++;
            }
            else { store[index] = nums2[j];
            j++;
            index++;
        }
        }
        if(i<nums1.length){
            for(int s =i; s<nums1.length;s++)
            {
                store[index] = nums1[s];
                index++;
            }
        }
        if(j<nums2.length){
            for(int s =j; s<nums2.length;s++)
            {
                store[index] = nums2[s];
                index++;
            }
        }
        
        if(store.length%2==0){
            return (double) ((double)store[store.length/2]+(double)store[store.length/2 -1])/2;
        }
        return (double) store[store.length/2];
    }
}