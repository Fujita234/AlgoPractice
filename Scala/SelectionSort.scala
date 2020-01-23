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
                    minj = j;
                }
            }
            var beSortedValue = list.apply(i);
            list.update(i, list.apply(minj));
            list.update(minj, beSortedValue);
        }
        return list;
    }
}
