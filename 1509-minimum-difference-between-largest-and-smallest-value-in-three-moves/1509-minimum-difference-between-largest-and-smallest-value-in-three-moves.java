import java.util.Arrays;

class Solution {
    public int minDifference(int[] nums) {
        int n = nums.length;
        

        if (n <= 4) {
            return 0;
        }
    
        Arrays.sort(nums);

        int minDifference = Integer.MAX_VALUE;
        
  
        minDifference = Math.min(minDifference, nums[n-4] - nums[0]);

        minDifference = Math.min(minDifference, nums[n-1] - nums[3]);
     
        minDifference = Math.min(minDifference, nums[n-2] - nums[2]);
     
        minDifference = Math.min(minDifference, nums[n-3] - nums[1]);
        
        return minDifference;
    }
}
