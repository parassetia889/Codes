class Solution {
    public String decodeString(String s) {
        
        String res = "";
        Stack<Integer> s1 = new Stack<>();
        Stack<String>  s2 = new Stack<>();
        int n = 0;
        
        for(int i = 0; i <s.length(); i++){
            char ch = s.charAt(i);
            
            if(ch >= '0' &&  ch <= '9')
                n = n*10 + (ch-'0');
            
            else if(ch == '['){
                s1.push(n);
                s2.push(res);
                n = 0;  res = "";
            }
            else if(ch == ']'){
                
                int k = s1.pop();
                String str = s2.pop();
                
                for(int j = 0; j < k; j++){
                    str = str + res;
                }
                
                res = str;
            }
            else
                res = res + ch;
        }
        return res;
    }
}