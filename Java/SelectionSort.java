import java.util.*;

public class SelectionSort {
    public static void main(String[] args) throws Exception {
        
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(1);
        list.add(3);
        
        System.out.println(selectionSort(list));
    }
    
    public static List<Integer> selectionSort(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            int minj = i;
            for (int j = i; j < list.size(); j++) {
                if (list.get(minj) > list.get(j)) {
                    int beSortedValue = list.get(j);
                    list.set(j, list.get(minj));                    
                    list.set(minj, beSortedValue);
                }
            }
        }
        return list;
    } 
}
