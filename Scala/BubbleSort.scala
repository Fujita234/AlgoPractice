import scala.collection.mutable.ListBuffer

object BubbleSort extends App{
    
    /**
     * バブルソート
     * @param list リスト
     * /
    def bubbleSort(list: ListBuffer[Int]):ListBuffer[Int] = {
        var n = list.length;
        for (i <- 0 until n; j <- n - 1 to i + 1 by -1) {
            if (list.apply(j) < list.apply(j - 1)) {
                var beSortedValue = list.apply(j);
                list.update(j, list.apply(j - 1));
                list.update(j - 1, beSortedValue);
            }
        }
        return list;
    }
    println(bubbleSort(ListBuffer(5, 2, 4, 6, 1, 3)))
}
