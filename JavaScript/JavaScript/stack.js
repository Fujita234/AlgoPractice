/**
 * stackを実装s
 * @param {リスト} lists 
 */
function stack(lists) {
  let stackList = []
  for (let i = 0; i < lists.length; i++) {
      let num = Number(lists[i]);
      if (isNaN(num)) {
          if (lists[i] === "+") {
              pop1 = stackList.pop();
              pop2 = stackList.pop();
              stackList.push(pop1 + pop2);
          } else if (lists[i] === "-") {
              pop1 = stackList.pop();
              pop2 = stackList.pop();
              stackList.push(pop1 - pop2);
          } else if (lists[i] === "*") {
              pop1 = stackList.pop();
              pop2 = stackList.pop();
              stackList.push(pop1 * pop2);
          } else {
              console.log(e);
          }
      } else {
          stackList.push(num);
      }
  }
  return stackList;
}


console.log(stack(["1","2","+","3","4","-","*"]));