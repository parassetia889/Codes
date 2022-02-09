
import java.util.*;

public class reverseString {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();

        for(int i = 0 ;i < str.length(); i++){
            stack.push(str.charAt(i));
        }

        String ans = "";
        while(!stack.empty()){
            ans += stack.pop();
        }

        System.out.println(ans);
    }
}
