class Solution {
    public int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;
        for(int i =0; i<nums.length;i++){
            if(start < nums[i]){
                start = nums[i];
            }
            end = end+nums[i];
        }
        while(start<= end){
            int mid = start + (end -start)/2;
            if(count(nums,mid)>k){
                start = mid+1;
            }
            else end = mid-1;
        }
        return start;
    }
    public int count(int[]nums,int mid){
        int sum =0;
        int count =0;
        for(int i =0; i<nums.length;i++){
            sum = sum + nums[i];
            if(sum>mid){
                count ++;
                sum = nums[i];
            }
        }
        return count+1;
    }
}