//https://www.codingninjas.com/codestudio/problems/reverse-stack-using-recursion_631875?topList=love-babbar-dsa-sheet-problems&leftPanelTab=0

import java.util.*;

public class Solution {
    
	public static void reverseStack(Stack<Integer> stack) {
		reverse(stack);
	}
    
    static void reverse(Stack<Integer> stack){
        
        //base condition
        if(stack.empty())
            return ;
        
        int num = stack.pop();
        reverse(stack);
        
        insertAtBottom(stack, num);
        
    }
    
    static void insertAtBottom(Stack<Integer> stack, int num){
        
        //base condition
        if(stack.empty()){
            stack.push(num);
            return;
        }
        
        int temp = stack.pop();
        insertAtBottom(stack, num);
        
        stack.push(temp);
    }

}
