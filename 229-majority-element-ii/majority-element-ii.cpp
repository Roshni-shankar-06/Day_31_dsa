class Solution {
 public:
  vector<int> majorityElement(vector<int>& nums) {
    vector<int> ans;
    int candidate1 = 0;
    int candidate2 = 1;   // any number different from candidate1
    int countSoFar1 = 0;  // the number of candidate1 so far
    int countSoFar2 = 0;  // the number of candidate2 so far

    for (const int num : nums)
      if (num == candidate1) {
     
