class Solution {
    public String reverseWords(String s) {
        
        Stack<String> stack = new Stack<>();
        
        for(String a : s.trim().split(" ")){
            if(a != "")
            stack.push(a.trim());
        }
        
        StringBuilder sb = new StringBuilder();
        
        while(!stack.empty()){
            sb.append(stack.pop()+" ");
        }
        
        return sb.toString().trim();
        
    }
}