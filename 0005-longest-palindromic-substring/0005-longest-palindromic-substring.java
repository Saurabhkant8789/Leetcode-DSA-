class Solution {
    public String longestPalindrome(String s) {
        
        String ans = "";
        int max =Integer.MIN_VALUE;
        for(int i =0; i<s.length(); i++){
            for(int j=i; j<s.length();j++){
                // checking if palindrome
                if ( palin (s,i,j) == true ){
                int count = j-i +1;
                    max = Math.max(count, max);
                    if(count == max){
                        ans = s.substring(i,j+1);
                    }
                }
                
            }
        }
        return ans ;
        
    }
    public static boolean palin (String s ,int x , int y){
        // x=i and y=j
        int index = y;
        for( int i = x; i<= (y+x)/2; i++){
            if(s.charAt(i)!=s.charAt(index)){
                return false;
            }
            else {
                index--;
            }
        }
        return true;
    }
}