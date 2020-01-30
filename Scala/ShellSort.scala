import scala.collection.mutable.ListBuffer

object ShellSort extends App{
    
    println(shellSort(ListBuffer(5, 9, 2, 4, 8, 6, 1, 3, 7)));
    
    /**
     * シェルソート
     * @param list リスト
     */
    def shellSort(list: ListBuffer[Int]):ListBuffer[Int] = {
        var n = list.length;
        var interval = 3;
        while(interval > 0) {
            var tmp = 0;
            while(tmp <= interval) {
                var i = 0;
                for(i <- tmp until n by interval) {
                    var beSortedValue = list.apply(i);
                    var j = i - interval;
                    while(j >= 0 && list.apply(j) > beSortedValue) {
                        list.update(j + interval, list.apply(j));
                        list.update(j, beSortedValue);
                        j -= interval;
                    }
                }
                tmp += 1;
            }
            interval -= 1;
        }
        return list;
    }
}
