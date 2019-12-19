import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class Top3 {
  public static void main(String args[]) {
    List<Integer> lists = List.of(25, 36, 4, 55, 71, 18, 0, 71, 89, 65);
    List<Integer> sortedList = lists.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    for (Integer i = 0; i < 3; i++) {
      System.out.println(sortedList.get(i));
    } 
  }
}