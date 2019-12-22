function MaximumProfit(list) {
  let min = 999999;
  let max = 0;
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


MaximumProfit([6, 5, 3, 1, 3, 4, 3]);
MaximumProfit([3, 4, 3, 2]);