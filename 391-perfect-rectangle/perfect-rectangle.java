class Solution {
  public boolean isRectangleCover(int[][] rectangles) {
    int area = 0;
    int x1 = Integer.MAX_VALUE;
    int y1 = Integer.MAX_VALUE;
    int x2 = Integer.MIN_VALUE;
    int y2 = Integer.MIN_VALUE;
    Set<String> corners = new HashSet<>();

  
