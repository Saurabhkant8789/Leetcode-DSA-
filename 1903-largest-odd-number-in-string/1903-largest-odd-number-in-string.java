class Solution {
    public String largestOddNumber(String num) {
        
        int temp =-5;
        
        for (int i=num.length()-1; i>=0;i--){
            if(num.charAt(i)%2!=0){
                temp = i;
                
                
                break;
                
            }     
        }
        if(temp==-5){
            return num.substring(0,0);
        }
        return num.substring(0,temp+1);
        
    }
}