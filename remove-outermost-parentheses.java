class Solution {
    public String removeOuterParentheses(String s) {
        int balance = 0;
        StringBuilder result = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                balance++;
                if (balance > 1) {
                    result.append(c);
                }
            } else if (c == ')') {
                balance--;
                if (balance > 0) {
                    result.append(c);
                }
            }
            
        }

        return result.toString();
        

        
    }
}
