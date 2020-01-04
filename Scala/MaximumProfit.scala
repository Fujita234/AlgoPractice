object MaximumProfit extends App{

    maximumProfit(List(6, 5, 3, 1, 3, 4, 3));
    maximumProfit(List(3, 4, 3, 2));
    

   /**
    * Listの最大利益を求めるメソッド
    */
    def maximumProfit(list: List[Int]) = {
        var max = 0;
        var min = 99999;
        var i = 0;
        for (i <- 0 to list.length - 1) {
            if (max < list.apply(i)) {
                max = list.apply(i);
            } 
            if (min >= list.apply(i)) {
                min = list.apply(i);
                max = 0;
            }
        }
        if (max < list.apply(i)) {
            max = list.apply(i);
        }
        println(max - min);
    }
}
