class Solution {
    public int myAtoi(String s) {
        
        long ans =0;
        int i =0;
        int sign = 1;
        while(i<s.length()  &&   s.charAt(i) == ' '){
            i++;
        }
        if(i<s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-')  ){
            if(s.charAt(i) == '-'){
                sign = -1;
            }
            i++;
        }
        
        while(i<s.length() && (s.charAt(i)-'0') >= 0 && (s.charAt(i)- '0') <=9  ){
            ans = ans*10 + (s.charAt(i) -'0');
            
             if( ans*sign < Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }
          if( ans*sign > Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }
            i++;
        }
        return (int) (ans*sign);
        
       
    }
}