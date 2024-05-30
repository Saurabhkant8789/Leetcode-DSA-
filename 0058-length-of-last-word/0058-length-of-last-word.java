class Solution {
    public int lengthOfLastWord(String s) {
        
        int i = s.length()-1;
        int count = 0;
        while(s.charAt(i)==' '){
            i--;
        }
        while(s.charAt(i)!=' '){
            count++;
            i--;
            if(i<0){
                break;
            }
        }
        return count;
        
    }
}