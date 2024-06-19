class Solution {
    public int appendCharacters(final String s, final String t) {
        final char[] sArray = s.toCharArray(), tArray = t.toCharArray();
        int j = 0;

        for(final char c : sArray) {
            if(c == tArray[j])
                ++j;

            if(j >= tArray.length)
                break;
        }

        return tArray.length - j;
    }
}