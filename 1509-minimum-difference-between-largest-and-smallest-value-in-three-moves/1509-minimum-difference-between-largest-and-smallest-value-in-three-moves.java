import java.util.Arrays;

class Solution {
    public int minDifference(int[] nums) {
        int n = nums.length;
        
        // If there are fewer than 4 elements, return 0 as per the problem statement
        if (n <= 4) {
            return 0;
        }
        
        // Sort the array
        Arrays.sort(nums);
        
        // Initialize the minimum difference to a large value
        int minDifference = Integer.MAX_VALUE;
        
        // Consider removing the first 3 elements
        minDifference = Math.min(minDifference, nums[n-4] - nums[0]);
        
        // Consider removing the last 3 elements
        minDifference = Math.min(minDifference, nums[n-1] - nums[3]);
        
        // Consider removing the first, second, and last element
        minDifference = Math.min(minDifference, nums[n-2] - nums[2]);
        
        // Consider removing the first, last, and second last element
        minDifference = Math.min(minDifference, nums[n-3] - nums[1]);
        
        return minDifference;
    }
}
