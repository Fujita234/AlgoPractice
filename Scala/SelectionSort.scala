import scala.collection.mutable.ListBuffer

object SelectionSort extends App{
    
    println(selectionSort(ListBuffer(5, 2, 4, 6, 1, 3)));
    
    /**
     * 選択ソート
     * @param list: リスト
     */
    def selectionSort(list: ListBuffer[Int]): ListBuffer[Int] = {
        for (i <- 0 until list.length) {
            var minj = i;
            for (j <- i until list.length) {
                if (list.apply(minj) > list.apply(j)) {
                    var beSortedValue = list.apply(j);
                    list.update(j, list.apply(minj));
                    list.update(minj, beSortedValue);
                }
            }
        }
        return list;
    }
}
