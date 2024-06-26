class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int n1=nums1.length,n2=nums2.length;
        ArrayList<Integer> a=new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0,j=0;
        while(i<n1 && j<n2){
            if(nums1[i]==nums2[j]){
                a.add(nums1[i]);
                i++;j++;
            }
            else if(nums1[i]<nums2[j]){
                i++;
            }
            else{
                j++;
            }
        }
        int ans[]=new int[a.size()];
        for(int k=0;k<a.size();k++){
            ans[k]=a.get(k);
        }
        return ans;
    }
}