//https://www.codingninjas.com/codestudio/problems/next-smaller-element_1112581?topList=love-babbar-dsa-sheet-problems&leftPanelTab=0

import java.util.*;
import java.io.*;

public class Solution{
    static ArrayList<Integer> nextSmallerElement(ArrayList<Integer> arr, int n){
       
        int[] res = new int[arr.size()];
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> al = new ArrayList();
        for(int i = arr.size()-1; i>=0; i--){
          
            while(!stack.isEmpty() &&stack.peek() >= arr.get(i))
                stack.pop();
            
            res[i] = stack.empty() ? -1 : stack.peek();
            stack.push(arr.get(i));
        }
        
       for(int i = 0; i<res.length; i++)
           al.add(res[i]);
        
        return al;
    }
}
