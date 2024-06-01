class Solution {
    public String removeOuterParentheses(String s) {
        int count = 0;
        String ans = new String();
        
        for (int i =0; i<s.length(); i++){
            
            if(s.charAt(i)=='(')
            {
                
               if(count ==0){
                count++;
                }
            else{
                ans = ans+'(';
                count ++;
            }
        }
            else if(s.charAt(i)==')'){
                if(count!=1){
                    ans = ans+')';
                    count--;
                }
             else if (count==1){
                 count--;
             }   
            }
           
        
    }
         return ans;
}
}