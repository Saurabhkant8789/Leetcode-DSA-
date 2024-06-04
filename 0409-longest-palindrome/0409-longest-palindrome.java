class Solution {
    public int longestPalindrome(String s) {
        int [] arr = new int[52];
        int pairs = 0;
        int indTmp;
        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) < 91)
                indTmp = s.charAt(i) - 65;
            else
                indTmp = s.charAt(i) - 71;
            if (arr[indTmp] != 0)
            {
                pairs++;
                arr[indTmp] = 0;
            }
            else
                arr[indTmp] = 1;
        }
        for (int i : arr) {
            if (i != 0)
                return pairs * 2 + 1;
        }
        return pairs * 2;
    }
}