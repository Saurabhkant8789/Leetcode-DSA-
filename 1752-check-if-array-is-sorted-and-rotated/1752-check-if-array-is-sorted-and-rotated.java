class Solution {
    public boolean check(int[] nums) {
        
        int max = nums[0];
        int index = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]>max){
                max = nums[i];
                index = i;
            }
        }
        System.out.println(index);
        for(int i=0; i<=index-1;i++){
            if(nums[i]>nums[i+1]){
                return false;
            }
            
        }
        for(int i = index+1; i<nums.length; i++){
            if(nums[i]!= nums[index]){
                index =i-1;
                break;
            }
        }
        System.out.println(index);
            for(int i=index+1; i<nums.length-1; i++){
            if(nums[i]>nums[i+1]){
                return false;
            }
        }
        
        if(index!= nums.length-1){
           if( nums[nums.length-1] > nums[0] ){
               return false;
           }
        }
        return true;
        
       
    }
}