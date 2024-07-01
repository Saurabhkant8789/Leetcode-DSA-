class Solution {
    public int singleNonDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        
        // Edge case: If there's only one element, it must be the non-duplicate
        if (nums.length == 1) {
            return nums[0];
        }
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            // Check if mid is even
            if (mid % 2 == 0) {
                // If mid is even, check both sides of mid
                if (mid != 0 && nums[mid] == nums[mid - 1]) {
                    end = mid - 2; // Move end to the left of mid-1
                } else if (mid != nums.length - 1 && nums[mid] == nums[mid + 1]) {
                    start = mid + 2; // Move start to the right of mid+1
                } else {
                    return nums[mid]; // Found the single non-duplicate element
                }
            } else {
                // If mid is odd, check both sides of mid
                if (mid != nums.length - 1 && nums[mid] == nums[mid + 1]) {
                    end = mid - 1; // Move end to the left of mid
                } else if (mid != 0 && nums[mid] == nums[mid - 1]) {
                    start = mid + 1; // Move start to the right of mid
                } else {
                    return nums[mid]; // Found the single non-duplicate element
                }
            }
        }
        
        // If no single element is found during the while loop, return nums[start]
        return nums[start];
    }
}
