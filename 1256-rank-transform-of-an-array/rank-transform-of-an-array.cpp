class Solution {
 public:
  vector<int> arrayRankTransform(vector<int>& arr) {
    vector<int> sortedArr(arr);
    unordered_map<int, int> rank;

    ranges::sort(sortedArr);

  
