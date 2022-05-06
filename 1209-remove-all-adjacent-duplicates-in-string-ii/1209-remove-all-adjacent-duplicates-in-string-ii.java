class Pair{
    int count;
    char ch;
    
    Pair(char ch, int count){
        
        this.ch = ch;
        this.count = count;
    }
}

class Solution {
    public String removeDuplicates(String s, int k) {
        
        Stack<Pair> st = new Stack<>();
        int n = s.length();
        
        for(int i = 0 ; i < n; i++){
            
            if(st.isEmpty()){
                st.push(new Pair(s.charAt(i), 1));
            }
            else{
                Pair curr = st.peek();
                
                if(curr.ch != s.charAt(i))
                    st.push(new Pair(s.charAt(i),1));
                else{
                    if(curr.count+1 == k)
                        st.pop();
                    else
                        curr.count++;
                }
            }
            
        }
        
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            Pair p = st.pop();
            
            while(p.count-- > 0)
                sb.append(p.ch);
        }
        
        return sb.reverse().toString();
    }
}