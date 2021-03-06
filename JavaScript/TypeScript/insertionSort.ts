/**
 * 挿入ソートを行うメソッド
 * @param list リスト
 */
const insertionSort = (list: number[]) => {
  for (let i = 0; i < list.length; i++) {
      let beSortedValue = list[i];
      let j = i - 1;
      while (j >= 0 && list[j] > beSortedValue) {
          list[j + 1] = list[j];
          list[j] = beSortedValue;
          j--;
      }
  }
  return list;
}

console.log(insertionSort([5, 2, 4, 6, 1, 3]));