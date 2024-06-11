class Solution {
    public String reverseWords(String s) {
        
        
        s = s.trim();        
        String [] words = s.split("\\s+");        
        String ans = "";
        for( int i=0; i<words.length;i++){
            ans = ans +words [words.length -i-1] + " ";            
            
        }
        ans = ans.trim();
        return ans;
    }
}