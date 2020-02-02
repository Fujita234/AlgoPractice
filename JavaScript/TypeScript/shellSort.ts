const shellSort = (list: number[]) => {
  var interval = 3;
  while (interval > 0) {
      var tmp = 0;
      while (tmp <= interval) {
          for (var i = tmp; i < list.length; i += interval) {
              var beSortedValue = list[i];
              var j = i - interval;
              while (j >= 0 && list[j] > beSortedValue) {
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


console.log(shellSort([5, 9, 2, 4, 8, 6, 1, 3, 7]));