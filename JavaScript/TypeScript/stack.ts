/**
 * stackの実装
 * @param list リスト
 */
const stack = (list: string[]) => {
  const stackList: number[] = [];
  let i = 0;
  for (i = 0; i < list.length; i++) {
      let pop1: number = 0;
      let pop2: number = 0;
      const num = parseInt(list[i]);
      if (isNaN(num)) {
          if (list[i] === "+") {
              pop1 = stackList.pop();
              pop2 = stackList.pop();
              stackList.push(pop1 + pop2);
          } else if (list[i] === "-") {
              pop1 = stackList.pop();
              pop2 = stackList.pop();
              stackList.push(pop1 - pop2);
          } else if (list[i] === "*") {
              pop1 = stackList.pop();
              pop2 = stackList.pop();
              stackList.push(pop1 * pop2);
          } else {
              console.log("ダメでした");
          }
      } else {
          stackList.push(num);
      }
  }
  return stackList;
}


console.log(stack(["1","2","+","3","4","-","*"]));