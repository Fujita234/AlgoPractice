import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(9);
        list.add(2);
        list.add(4);
        list.add(8);
        list.add(6);
        list.add(1);
        list.add(3);
        list.add(7);
        d
        System.out.println(shellSort(list));
    }
    
    /**
     * シェルソート
     * @param list リスト
     */
    public static List<Integer> shellSort(List<Integer> list) {
        int n = list.size();
        int interval = 3;
        while(interval > 0) {
            int tmp = 0;
            while (tmp <= interval) {
                for (int i = tmp; i < n; i += interval) {
                    int sortedValue = list.get(i);
                    int j = i - interval;
                    while( j >= 0 && list.get(j) > sortedValue) {
                        list.set(j + interval, list.get(j));
                        j -= interval;
                        list.set(j + interval, sortedValue);
                    }
                }
                tmp++;
            }
            interval--;
        }
        return list;
    }
}
