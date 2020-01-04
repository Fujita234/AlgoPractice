object Top3 extends App{
    val list1: List[Int] = List(25, 36, 4, 55, 71, 18, 0, 71, 89, 65);
    top3(list);

    /**
     * 配列の中でTOP3の値を取得する
     */
    def top3(list: List[Int]) = {
        var editedList: List[Int] = list;
        var maxValue = 0;
        for (i <- 0 until 3) {
            maxValue = editedList.max;
            editedList = editedList.diff(List(maxValue));
            println(maxValue);
        };
    };
}