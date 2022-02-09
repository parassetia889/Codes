//https://www.codingninjas.com/codestudio/problems/minimum-cost-to-make-string-valid_1115770?leftPanelTab=0

import java.util.*;
public class Solution {
    public static int findMinimumCost(String str) {
		if(str.length()%2 != 0)
            return -1;
        
        //removig valid pairs
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            
            if(ch == '{')
                stack.push(ch);
            else{
                
                //if ch is closed
                if(!stack.empty() && stack.peek() == '{')
                    stack.pop();
                else  //putting it back, if pair not found
                    stack.push(ch);
            }
        }
        
        //after the loop ends, our stack has only invalid expression
        int a = 0, b = 0;
        while(!stack.empty()){
            if(stack.peek() == '{')
                a++;
            else
                b++;
            
            stack.pop();
        }
        
        return ((a+1)/2 + (b+1)/2);
    }
}
