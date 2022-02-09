//https://www.codingninjas.com/codestudio/problems/sort-a-stack_985275?topList=love-babbar-dsa-sheet-problems&leftPanelTab=1
//  sorting a stack using recursion stack
import java.util.*;
public class Solution {

	public static void sortStack(Stack<Integer> stack) {
		
        //base condition
        if(stack.empty())
            return;
        
        int num = stack.pop();
        
        //recursive call
        sortStack(stack);
        
        sortedInsert(stack, num);
 
	}
    
    static void sortedInsert(Stack<Integer> stack, int num){
        
        //base condition
        if(stack.empty() || (!stack.empty() && stack.peek() <= num)){
            stack.push(num);
        	return;}
        
        int temp  = stack.pop();
        
        sortedInsert(stack, num);
        stack.push(temp);
    }

}
