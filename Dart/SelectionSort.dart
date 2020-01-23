void main() {
  
  /**
   * 選択ソート
   * @param list リスト
   */
  List<int> selectionSort(List<int> list) {
    final n = list.length;
    for (var i = 0; i < n; i++) {
      var minj = i;
      for (var j = minj; j < n; j++) {
        if (list[minj] > list[j]) {
          minj = j;
        }
      }
      var beSortedValue = list[i];
      list[i] = list[minj];
      list[minj] = beSortedValue;
    }
    return list;
  }
  print(selectionSort([4, 2, 5, 6, 1, 3]));
}
