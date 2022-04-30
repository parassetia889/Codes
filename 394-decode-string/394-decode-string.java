class Solution {
    public String decodeString(String s) {
       
        String res = "";
        Stack<Integer> s1 = new Stack<>();
        Stack<String>  s2 = new Stack<>();
        int n = 0;
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            
            if(c >= '0' && c <= '9'){
                n = n*10 + (c-'0');
            }
            else if(c == '['){
                
                s1.push(n);
                s2.push(res);
                n = 0;  res = "";
            }
            else if(c == ']'){
                int k = s1.pop();
                String str = s2.pop();
                for(int j = 0; j < k; j++){
                    str = str + res;
                }
                
                res = str;
            }
            else{  //character
                res += c;
            }
            
            
        }
        return res;
    }
}