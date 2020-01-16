/**
 * バブルソート
 * @param {リスト} list 
 */
function bubbleSort(list) {
  let n = list.length;
  let i = 0;
  for (i = 0; i < n; i++) {
      for (let j = n - 1; j >= i + 1; j--) {
          if (list[j - 1] > list[j]) {
              const beSortedValue = list[j];
              list[j] = list[j - 1];
              list[j - 1] = beSortedValue;
          }
      }
  }
  return list;
}


console.log(bubbleSort([5, 2, 4, 6, 1, 3]));