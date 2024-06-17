class Solution {
    public boolean judgeSquareSum(int c) {
        
    long right = (long)Math.sqrt(c)+1;
        long left = 0;
        
        while(left<=right){
            if(left*left + right*right == c){
                return true;
            }
            
            if(left*left +right*right >c){
                right --;
                }
            else left ++;
            
        }
        return false;
    }
}