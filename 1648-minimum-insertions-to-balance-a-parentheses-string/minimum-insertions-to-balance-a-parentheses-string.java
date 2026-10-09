import java.util.Stack;

class Solution {
    public int minInsertions(String s) {
        int insertions = 0;
        Stack<Character> stack = new Stack<>();
        int n = s.length();
        
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            
            if (c == '(') {
                stack.push(c);
            } else {
                // We encountered a ')'
                // Check if the NEXT character is also a ')' to form the required pair "))"
                if (i + 1 < n && s.charAt(i + 1) == ')') {
                    // It is a valid consecutive pair, skip the next index
                    i++; 
                } else {
                    // Missing one ')', we must insert it right here
                    insertions++; 
                }
                
                // Now try to match this pair with an opening '('
                if (!stack.isEmpty()) {
                    stack.pop(); // Match found, pop one '('
                } else {
                    // No '(' available, we must insert a '('
                    insertions++; 
                }
            }
        }
        
        // After scanning, each leftover '(' in the stack needs two ')'
        insertions += stack.size() * 2;
        
        return insertions;
    }
}

