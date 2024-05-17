class Solution {
    public int[] shuffle(int[] nums, int n) {
        int j = nums.length -n;
        int k = 0;
        int [] ans = new int [nums.length];
        for(int i=0; i<nums.length; i++){
            if (i%2 == 0)
                
            
            
            { ans[i] = nums[k];
                k++;
            }
            else 
            {
                ans [i] = nums[j] ;
                j++;
            }
         
        }
        return ans;
    }
}