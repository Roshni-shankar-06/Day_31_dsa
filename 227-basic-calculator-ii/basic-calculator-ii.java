class Solution {
  public int calculate(String s) {
    Deque<Integer> nums = new ArrayDeque<>();
    Deque<Character> ops = new ArrayDeque<>();

    for (int i = 0; i < s.length(); ++i) {
      final char c = s.charAt(i);
      if (Character.isDigit(c)) {
       
