class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        
        String shortestString = strs[0];
        
        // Find the shortest string in the array
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() < shortestString.length()) {
                shortestString = strs[i];
            }
        }
        
        StringBuilder commonPrefix = new StringBuilder();
        
        // Compare characters at each index of the shortest string with other strings
        for (int i = 0; i < shortestString.length(); i++) {
            char currentChar = shortestString.charAt(i);
            for (String str : strs) {
                if (str.charAt(i) != currentChar) {
                    return commonPrefix.toString();
                }
            }
            commonPrefix.append(currentChar);
        }
        
        return commonPrefix.toString();
    }
}
