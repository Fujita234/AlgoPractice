import scala.collection.mutable.ListBuffer

object Main extends App{

    println(insertionSort(ListBuffer(5, 2, 4, 6, 1, 3)));
    
    /**
     * 挿入ソートを実装
     * @param list リスト
     **/
    def insertionSort(list: ListBuffer[Int]):ListBuffer[Int] = {
        for (i <- 0 until list.length) {
            var beSortedValue = list.apply(i);
            var j = i - 1;
            while(j >= 0 && list.apply(j) > beSortedValue) {
                list.update(j + 1, list.apply(j));
                list.update(j, beSortedValue);
                j -= 1;
            }
        }
        return list
    }
}
