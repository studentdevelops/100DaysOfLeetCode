class Solution {
    public boolean isValid(String s) {
        Stack<Character> parenStack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                parenStack.push(')');
            else if (c == '{')
                parenStack.push('}');
            else if (c == '[')
                parenStack.push(']');
            else if (parenStack.isEmpty() || parenStack.pop() != c)
                return false;
        }
        return parenStack.isEmpty();
    }
}
