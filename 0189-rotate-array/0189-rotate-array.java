class Solution {
    public void rotate(int[] nums, int k) {
    
        int[] ans = new int[nums.length];
        int j =0;
        if(nums.length==1){
            return;
        }
        if(k<nums.length){
        for(int i=nums.length-k; i<nums.length; i++){
            ans[j] = nums[i];
                j++;
        }
        for(int i=0; i<=nums.length-k-1;i++){
            ans[j]=nums[i];
            j++;
            
        }
        for(int i=0; i<nums.length;i++){
            nums[i] = ans[i];
        }
            return;
        

        }
        if(k%nums.length==0){
            return;
        }
        k = k%nums.length;
        for(int i=nums.length-k; i<nums.length; i++){
            ans[j] = nums[i];
                j++;
        }
        for(int i=0; i<=nums.length-k-1;i++){
            ans[j]=nums[i];
            j++;
            
        }
        for(int i=0; i<nums.length;i++){
            nums[i] = ans[i];
        }
            return;
        
    }
}