/**
 * 選択ソート
 * @param list リスト
 */
const SelectionSort = (list: number[]) => {
  let i = 0;
  let j = 0;
  const n = list.length;
  for (i = 0; i < n; i++) {
      let minj = i;
      for (j = minj; j < n; j++) {
          if (list[minj] > list[j]) {
              minj = j;
          }
      }
      let beSortedValue = list[i];
      list[i] = list[minj];
      list[minj] = beSortedValue;
  }
  return list;
}


console.log(selectionSort([5, 2, 4, 3, 6, 1]));