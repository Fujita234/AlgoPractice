import java.util.List;


public class MaximumProfit {
  public static void main(String args[]) {
    List<Integer> lists1 = List.of(6, 5, 3, 1, 3, 4, 3);
    List<Integer> lists2 = List.of(3, 4, 3, 2);

    Integer min = 999999;
    Integer max = 0;
    
    /**
     * list1の回答
     */
    int i;
    // 最大利益を生み出すアルゴリズム
    for (i = 0; i < lists1.size() - 1; i++) {
      if (max < lists1.get(i)) {
        max = lists1.get(i);
      }

      if (min >= lists1.get(i)) {
        min = lists1.get(i);
        max = 0;
      }
    }
    
    // 最大利益を出せなかった時の対処
    if (max < lists1.get(i)) {
        max = lists1.get(i);
    }
    System.out.println(max - min);


    /**
     * list2の回答
     */
    min = 999999;
    max = 0;
    // 最大利益を生み出すアルゴリズム
    for (i = 0; i < lists2.size() - 1; i++) {
      if (max < lists2.get(i)) {
        max = lists2.get(i);
      }

      if (min >= lists2.get(i)) {
        min = lists2.get(i);
        max = 0;
      }
    }
    
    // 最大利益を出せなかった時の対処
    if (max < lists2.get(i)) {
        max = lists2.get(i);
    }
    System.out.println(max - min);
  }
}