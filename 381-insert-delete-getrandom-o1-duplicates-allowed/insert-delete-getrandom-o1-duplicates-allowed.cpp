struct Item {
  int val;
  int indexInMap;
};

class RandomizedCollection {
 public:
  bool insert(int val) {
    valToIndices[val].push_back(items.size());
    items.emplace_back(val, valToIndices[val].size() - 1);
    return valToIndices[val].size() == 1;
  }

  bool remove(int val) {
  
