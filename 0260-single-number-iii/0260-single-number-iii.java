class Solution {
    public int[] singleNumber(int[] nums) {
        if (nums == null || nums.length < 2) return new int[0];
        int t = 0;
        for (int n: nums) t ^= n;
        t &= -t;
        int[] ret = new int[2];
        for (int n: nums) {
            if ((t & n) > 0) ret[0] ^= n;
            else ret[1] ^= n;
        }
        return ret;
    }
}