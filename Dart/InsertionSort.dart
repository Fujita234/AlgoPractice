void main() {
  
  /**
   * 挿入ソート
   * @param list リスト
   */
  List<int> insertionSort(List<int> list) {
    for (var i = 0; i < list.length; i++) {
      var beSortedValue = list[i];
      var j = i - 1;
      while(j >= 0 && list[j] > beSortedValue) {
        list[j + 1] = list[j];
        list[j] = beSortedValue;
        j--;
      }
    }
    return list;
  }
  
  print(insertionSort([5, 2, 4, 6, 1, 3]));
}
