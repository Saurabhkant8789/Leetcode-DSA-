class Solution {
    public int reverse(int x) {
        
        long ans =0;
        while(x!=0){
            
            ans = ans*10 + (long)(x%10);
            x = x/10;
        }
        if(ans > 2147483647 || ans < -2147483648){
            return 0;
        }
         return (int) ans;
        
    }
   
}