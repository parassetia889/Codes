package stack_queues;
import java.util.*;
public class sortStack {
    public static void sort(Stack<Integer> stack) {
        Stack<Integer> stack2 = new Stack<>();
        while (!stack.isEmpty()) {
            int temp = stack.pop();
            while (!stack2.isEmpty() && stack2.peek() > temp) {
                stack.push(stack2.pop());
            }
            stack2.push(temp);
        }
        while (!stack2.isEmpty()) stack.push(stack2.pop());
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(9);
        stack.push(2);
        stack.push(7);
        stack.push(4);
        stack.push(6);
        sort(stack);
        System.out.println(stack);
    }
}
