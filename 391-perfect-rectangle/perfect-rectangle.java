class Solution {
  public boolean isRectangleCover(int[][] rectangles) {
    int area = 0;
    int x1 = Integer.MAX_VALUE;
    int y1 = Integer.MAX_VALUE;
    int x2 = Integer.MIN_VALUE;
    int y2 = Integer.MIN_VALUE;
    Set<String> corners = new HashSet<>();

    for (int[] r : rectangles) {
      area += (r[2] - r[0]) * (r[3] - r[1]);
      x1 = Math.min(x1, r[0]);
      y1 = Math.min(y1, r[1]);
      x2 = Math.max(x2, r[2]);
      y2 = Math.max(y2, r[3]);

      // the four points of the current rectangle
   
