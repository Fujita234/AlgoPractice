/**
 * バブルソートをする関数
 * @param list リスト
 */
const bubbleSort = (list: number[]) => {
  const n = list.length;
  for (let i = 0; i < n; i++) {
      for (let j = n - 1; j >= i + 1; j--) {
          if (list[j] < list[j - 1]) {
              let beSortValue = list[j];
              list[j] = list[j - 1];
              list[j - 1] = beSortValue;
          }
      }
  }
  return list;
}

console.log(bubbleSort([5, 2, 4, 6, 1, 3]));