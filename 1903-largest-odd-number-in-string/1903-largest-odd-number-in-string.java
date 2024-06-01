class Solution {
    public String largestOddNumber(String num) {
        
        int temp =-5;
        String ans = "";
        for (int i=num.length()-1; i>=0;i--){
            if(num.charAt(i)%2!=0){
                temp = i;
                
                
                break;
                
            }     
        }
        for (int i=0; i<=temp; i++){
                ans = ans+num.charAt(i);
            }
        return ans;
    }
}