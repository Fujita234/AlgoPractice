/**
 * 配列の中でTOP3の値を取得する
 */
function top3() {
  const list = [25, 36, 4, 55, 71, 18, 0, 71, 89, 65];

  for (let i = 0; i < 3; i++) {
    const maxValue = Math.max(...list);
    const deletedIndexNumber = list.indexOf(maxValue);
    list.splice(deletedIndexNumber, 1);
    console.log(maxValue);
  }
}