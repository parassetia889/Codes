import java.util.*;
class Solution {
    
    public int[] prevSmaller(int[] arr){
        
        Stack<Integer> stack = new Stack<>();
        int p[] = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            while( !stack.empty() && arr[stack.peek()] >= arr[i])
                stack.pop();
            
            if(stack.empty())
                p[i] = -1;
            else
                p[i] = stack.peek();
            
            stack.push(i);
        }
        
        return p;
    }
    
    public int[] nextSmaller(int[] arr){
        
        Stack<Integer> stack = new Stack<>();
        int[] q = new int[arr.length];
        
        for(int i = arr.length-1; i >= 0; i--){
            while( !stack.empty() && arr[stack.peek()] >= arr[i])
                stack.pop();
            
            if(stack.empty())
                q[i] = arr.length;
            else
                q[i] = stack.peek();
            
            stack.push(i);
        }
        return q;
    }
    public int largestRectangleArea(int[] heights) {
        
       
        int[] ps = prevSmaller(heights);
        int[] ns = nextSmaller(heights);
        
        int max = Integer.MIN_VALUE;
        
        for(int i = 0; i<heights.length; i++)
            max = Math.max(((ns[i]-ps[i]-1)*heights[i]),  max);
        
        return max;
    }
    
}