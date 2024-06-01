class Solution {
    public int scoreOfString(String s) {
        int sum = 0;
        int x = 0;
        for(int i=0;i<s.length()-1;i++){
           x= Math.abs((int) s.charAt(i)- (int)s.charAt(i+1));
            sum = sum + x;
            
            
        }
        return sum;
    }
}