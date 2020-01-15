void main() {
  
  /**
   * バブルソート
   * @param list リスト
   */
  List<int> bubbleSort(List<int> list) {
    final n = list.length;
    for (var i = 0; i < n; i++) {
      for (var j = n - 1; j >= i + 1; j--) {
        if (list[j] < list[j - 1]) {
          int beSortedValue = list[j];
          list[j] = list[j - 1];
          list[j - 1] = beSortedValue; 
        }
      }
    }
    return list;
  }
  print(bubbleSort([5, 2, 4, 6, 1, 3]));
}
