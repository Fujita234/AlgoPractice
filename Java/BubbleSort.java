import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(1);
        list.add(3);
        
        System.out.println(bubbleSort(list));
    }
    
    /**
     * バブルソートをするメソッド
     * @param list リスト
     */
    public static List<Integer> bubbleSort(List<Integer> list) {
        int n = list.size();
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j >= i + 1; j--) {
                if (list.get(j) < list.get(j - 1)) {
                    int beSortedValue = list.get(j);
                    list.set(j, list.get(j - 1));
                    list.set(j - 1, beSortedValue);
                }
            }
        }
        return list;
    }
}
