function mergeSort(list, sortedList, firstIndex, lastIndex) {
  if (firstIndex < lastIndex) {
    const mid = Math.floor((firstIndex + lastIndex) / 2);
    mergeSort(list, sortedList, firstIndex, mid);
    mergeSort(list, sortedList, mid + 1, lastIndex);

    merge(list, sortedList, firstIndex, mid + 1, lastIndex);
  }
}

function merge(list, sortedList, firstIndex, mid, lastIndex) {
  let i;
  let left_end;
  let num_elements;
  let tmp_pos;

  left_end = mid - 1;
  tmp_pos = firstIndex;
  num_elements = lastIndex - firstIndex + 1; /* 配列の要素数 */

   /* 2つのリストに要素が残っている */
  while ((firstIndex <= left_end) && (mid <= lastIndex)) {
    if (list[firstIndex] <= list[mid]) {
      sortedList[tmp_pos] = list[firstIndex];
      tmp_pos = tmp_pos + 1;
      firstIndex = firstIndex + 1;
    } else {
      sortedList[tmp_pos] = list[mid];
      tmp_pos = tmp_pos + 1;
      mid = mid + 1;
    }
  }

  /* 左側のリスト */
  while (firstIndex <= left_end) {
    sortedList[tmp_pos] = list[firstIndex];
    firstIndex = firstIndex + 1;
    tmp_pos = tmp_pos + 1;
  }

  /* 右側のリスト */
  while (mid <= lastIndex) {
    sortedList[tmp_pos] = list[mid];
    mid = mid + 1;
    tmp_pos = tmp_pos + 1;
  }

  /* 昇順に整列するようひとつのリストにまとめる */
  for (i=0; i <= num_elements; i++) {
    list[lastIndex] = sortedList[lastIndex];
    lastIndex = lastIndex - 1;
  }
}

/** InputDate */
(async function main() {
  const list = await userInput('Input list: ');
  const numberList = list.split(', ').map(str => parseInt(str, 10));
  let sortedList = [];
  const firstIndex = 0;
  const lastIndex = numberList.length;
  mergeSort(numberList, sortedList, firstIndex, lastIndex - 1);
  console.log(sortedList);
})();

function userInput(question) {
  const readline = require('readline').createInterface({
    input: process.stdin,
    output: process.stdout
  });

  return new Promise((resolve, reject) => {
    readline.question(question, (answer) => {
      resolve(answer);
      readline.close();
    });
  });
}
