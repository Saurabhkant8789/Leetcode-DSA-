class Solution {
    public void reverseString(char[] s) {
        char temp = ' ';
        int left = 0; 
        int right=s.length-1;

        while(left<right){
            temp = s[left];
            s[left] = s[right];
            s[right]=temp;
            left++;
            right--;
        }
    }
}