class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int totalSubsets = 1 << nums.length;
        List<List<Integer>> answer = new ArrayList<>();
        for(int bits=0;bits<totalSubsets;bits++){
            List<Integer> currentSubSet = new ArrayList<>();
            for(int index=0;index<nums.length;index++){
                if(((bits>>index)&1)==1) currentSubSet.add(nums[index]);
            }
            answer.add(currentSubSet);
        }
        return answer;
    }
}