// tsでMaximumProfitアルゴリズム
const maximumProfit = (list: number[]) => {
  let max: number = 0;
  let min: number = 9999999;
  let i = 0;

  for (i = 0; i < list.length - 1; i++) {
    if (max < list[i]) {
        max = list[i];
    }

    if (min >= list[i]) {
        min = list[i];
        max = 0;
    }
  }

if (max < list[i]) {
    max = list[i];
}
console.log(max - min);
}

maximumProfit([6, 5, 3, 1, 3, 4, 3]);
maximumProfit([3, 4, 3, 2]); 