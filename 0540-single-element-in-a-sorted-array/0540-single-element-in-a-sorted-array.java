class Solution {
    public int singleNonDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        
        if (nums.length == 1) {
            return nums[0];
        }
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(mid%2 == 0){
                if(mid!=0 && nums[mid] == nums[mid-1]){
                    end = mid-2;
                }
               else if(mid != nums.length-1 && nums[mid] == nums[mid+1]){
                    start = mid+2;
                }
                else return nums[mid];
            }
            
            else {
                if(nums[mid]== nums[mid-1]){
                    start = mid+1;
                }
                if(nums[mid]==nums[mid+1]){
                    end = mid-1;
                }
            }
        }
        
        return nums[start];
    }
}
