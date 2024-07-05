class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int start = 1;
        int end = nums[0];
        for(int i =0; i<nums.length;i++){
            if(end<nums[i]){
                end = nums[i];
            }
        }
        while(start<=end){
            int mid = start + (end-start)/2;
            if(sum(nums,mid) <= threshold){
                 end = mid-1;
            }
            // else if(sum(nums,mid)<= threshold){
            //     end = mid-1;
            
            else start = mid+1;
        }
        return start;
    }
    
    public int sum(int[] nums,int mid){
        int sum =0;
        for(int i =0; i<nums.length;i++){
            sum = sum + (int)Math.ceil((double) nums[i]/(double)mid);
        }
        return sum;
        
    }
}