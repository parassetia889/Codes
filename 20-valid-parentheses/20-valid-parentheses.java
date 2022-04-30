class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0 ; i < s.length(); i++){
            
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{')
                stack.push(s.charAt(i));
            
            else{   //closing
                if(stack.isEmpty())
                    return false;
                else{
                    char c = stack.pop();
                    if(s.charAt(i) == ')' && c != '(')
                        return false;
                    else if(s.charAt(i) == ']' && c != '[')
                        return false;
                    else if(s.charAt(i) == '}' && c != '{')
                        return false;
                  
                    
                }
                    
            }
        }
        
        return stack.isEmpty();
    }
}