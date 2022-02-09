package stack_queues;

import java.util.Stack;

public class DuplicateParenthesis {
    public static boolean containsParenthesis(String str){

        Stack<Character> stack = new Stack<>();
        for(int index = 0; index < str.length(); index++){

            char current = str.charAt(index);
            if(current != ')')
                stack.push(current);
            else{
                int count = 0;
                Character top = stack.pop();
                while (top != '('){
                    top = stack.pop();
                    count++;
                }
                if(count < 1)
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
            String str = "()";
        System.out.println(containsParenthesis(str));
    }
}
