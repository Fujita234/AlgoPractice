/**
 * 選択ソート
 * @param list リスト
 */
function selectionSort(list) {
  for (let i = 0; i < list.length; i++) {
      let minj = i;
      for (j = i; j < list.length; j++) {
          if (list[j] < list[minj]) {
              minj = j;
          }
      }
      let beSortedValue = list[i];
      list[i] = list[minj];
      list[minj] = beSortedValue;
  }
  return list;
}


console.log(selectionSort([5, 2, 4, 6, 1, 3]));