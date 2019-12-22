import java.util.List;
import java.util.ArrayList;

public class MaximumProfit {
  public static void main(String args[]) {
    List<Integer> list1 = List.of(6, 5, 3, 1, 3, 4, 3);
    List<Integer> lists2 = List.of(3, 4, 3, 2);

    maximumProfit(list1);
    maximumProfit(list2);
  }

  /**
   * Listの最大利益を求めるメソッド
   */
  public static void maximumProfit(List<Integer> list) {
    Integer min = 999999;
    Integer max = 0;
    int i;
    // 最大利益を生み出すアルゴリズム
    for (i = 0; i < list.size() - 1; i++) {
      if (max < list.get(i)) {
        max = list.get(i);
      }

      if (min >= list.get(i)) {
        min = list.get(i);
        max = 0;
      }
    }
    
    // 最大利益を出せなかった時の対処
    if (max < list.get(i)) {
        max = list.get(i);
    }
    System.out.println(max - min);
  }
}