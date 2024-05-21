class Solution {
    public List<String> generateParenthesis(int n) {
        Set<String> ansSet = new HashSet<String>();
        ansSet.add("()");
        Set<String> newAnsSet;
        char[] charArr;
        for (int i = 1; i < n; i++) {
            newAnsSet = new HashSet<>();
            for (String ans : ansSet) {
                charArr = ans.toCharArray();
                for (int j = 1; j <  charArr.length; j++) {
                    if (charArr[j] == ')') {
                        newAnsSet.add(getPairInsertedBefore(ans, j));
                        newAnsSet.add(getPairInsertedAfter(ans, j));
                    }
                }
            }
            ansSet = newAnsSet;
        }
        return new ArrayList<>(ansSet);
    }
    
    private String getPairInsertedBefore(String s, int j) {
        StringBuilder sbBefore = new StringBuilder(s);
        sbBefore.insert(j, "()");
        return sbBefore.toString();
    }
    
    private String getPairInsertedAfter(String s, int j) {
        StringBuilder sbAfter = new StringBuilder(s);
        sbAfter.insert(j+1, "()");
        return sbAfter.toString();
    }
}