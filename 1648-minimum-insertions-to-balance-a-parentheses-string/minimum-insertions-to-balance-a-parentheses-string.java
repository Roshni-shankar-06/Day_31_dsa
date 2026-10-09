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
              
