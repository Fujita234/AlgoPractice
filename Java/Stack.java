import java.util.*;

/**
 * Stackの実装
 */
public class Main {
    public static void main(String[] args) throws Exception {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("+");
        list.add("3");
        list.add("4");
        list.add("-");
        list.add("*");

        System.out.println(stack(list));
        System.out.println(pop());
    }
    /**
     * Stackを実装します。
     * @param lists 入力された値のList
     * @return Stackリスト
     */
    public static List<Integer> stack(List<String> lists) {
        List<Integer> stackList = new ArrayList<>();
        for (String list : lists) {
            try {
                Integer num = Integer.parseInt(list);
                push(stackList, num);
            } catch (NumberFormatException e) {
                if (list.equals("+")) {
                    pop1 = pop(stackList);
                    pop2 = pop(stackList);
                    push(list, pop1 + pop2);
                } else if (list.equals("-")) {
                    pop2 = pop(stackList);
                    pop1 = pop(stackList);
                    push(list, pop1 - pop2);
                } else if (list.equals("*")) {
                    pop1 = pop(stackList);
                    pop2 = pop(stackList);
                    push(list, pop1 * pop2);
                } else {
                    System.out.println(e);
                }
            }
        }
        return stackList;
    }
    
    /**
     * 数字をStackリストに入れます。
     * @param list stackリスト
     * @param num stackに入れる数字
     * @return 数字が入ったリスト
     */
    public static List<Integer> push(List<Integer> list, Integer num) {
        list.add(num);
        return list;
    }
    
    /**
     * Stackリストから数字を取り出します。
     * @param list Stackリスト
     * @return 取り出された数字
     */
    public static List<Integer> pop(List<Integer> list) {
        Integer n = list.length - 1;
        Integer popedValue = list.get(n);
        list.remove(n);
        return popedValue;
    }
}
