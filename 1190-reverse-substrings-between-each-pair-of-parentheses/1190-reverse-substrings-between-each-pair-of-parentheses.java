class Solution {
    public String reverseParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '(') stack.push(i);
            else if(s.charAt(i) == ')'){
                // get the string from stack.top to i and reverse it.
                String toReverse = s.substring(stack.peek()+1, i);
                String reversedSubstring = new StringBuilder(toReverse).reverse().toString();
                s = s.substring(0, stack.peek()) + reversedSubstring + s.substring(i+1);
                stack.pop();
                i-=2;
            }
        }
        return s;

    }
}