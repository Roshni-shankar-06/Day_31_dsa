struct Item {
  int val;
  int indexInMap;
};

class RandomizedCollection {
 public:
  bool insert(int val) {
    valToIndices[val].push_back(items.size());
   
