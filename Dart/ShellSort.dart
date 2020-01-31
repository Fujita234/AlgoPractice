void main() {
  
  /**
   * シェルソート
   * @param list リスト
   */
  List<int> shellSort(List<int> list) {
    final n = list.length;
    var interval = 3;
    while(interval > 0) {
      var tmp = 0;
      while(tmp <= 0) {
        for (var i = tmp; i < list.length; i += interval) {
          var beSortedValue = list[i];
          var j = i - interval;
          while(j >= 0 && list[j] > beSortedValue) {
            list[j + interval] = list[j];
            list[j] = beSortedValue;
            j -= interval;
          }
        }
        tmp++;
      }
      interval--;
    }
    return list;
  }
  
  print(shellSort([2, 3, 4, 1, 9, 6, 5, 8, 7]));
}
