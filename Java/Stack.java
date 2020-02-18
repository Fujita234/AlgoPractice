import java.util.*;

/**
 * Stackの実装
 */
public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(stack());
        System.out.println(pop());
    }
    
    public static List<Integer> stack() {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int pop1 = 0;
        int pop2 = 0;
        if (str.epuals("+")) {
            pop1 = pop();
            pop2 = pop();
            push(pop1 + pop2);
        } else if (str.epuals("-")) {
            pop2 = pop();
            pop1 = pop();
            push(pop1 - pop2);
        } else if (str.epuals("*")) {
            pop1 = pop();
            pop2 = pop();
            push(pop1 * pop2);
        } else {
            
        }
    }
    
    /**
     * pushを実装
     */
    public static List<Integer> push(List<Integer> list, Integer addValue) {
        list.add(addValue);
        return list;
    }
    
    /**
     * popを実装
     */
    public static List<Integer> pop(List<Integer> list) {
        Integer n = list.length - 1;
        Integer popedValue = list.get(n);
        list.remove(n);
        return popedValue;
    }
}
