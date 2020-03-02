/**
 * シェルソート
 * @param list リスト
 */
function shellSort(list) {
  let n = list.length;
  let interval = 3;
  while(interval > 0) {
    let tmp = 0;
    while(tmp <= interval) {
      for (let i = 0; i < n; i += interval) {
        let beSortedValue = list[i];
        let j = i - interval;
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


console.log(shellSort([2, 3, 4, 1, 9, 6, 5, 8, 7]));