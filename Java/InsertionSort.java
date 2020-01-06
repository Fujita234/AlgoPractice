import java.util.*;

public class InsertionSort {
    public static void main(String[] args) throws Exception {
        // Your code here!
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(1);
        list.add(3);
        
        System.out.println(insertionSort(list, list.size()));
    }
    
    /**
     * 挿入ソートを行うメソッド
     */
    public static List<Integer> insertionSort(List<Integer> list, int n) {
        for (int i = 1; i < n; i++) {
            int sortedValue = list.get(i);
            int j = i - 1;
            while( j >= 0 && list.get(j) > sortedValue) {
                list.set(j + 1, list.get(j));
                j--;
                list.set(j + 1, sortedValue);
            }
        }
        return list;
    }
}
