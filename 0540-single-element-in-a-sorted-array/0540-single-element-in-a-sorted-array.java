class Solution {
    public int singleNonDuplicate(int[] nums) {
        int value = 0;
        for(int i =0; i<nums.length; i++){
            value = nums[i]^value;
        }
        return value;
    }
}