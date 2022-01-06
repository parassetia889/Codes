class Solution {
    public void reverseString(char[] st) {
        int n = st.length;
        char temp;
        
        int s = 0, e = n-1;
        while(s<e)
        {
            temp = st[s];
            st[s++] = st[e];
            st[e--] = temp;
          
        }
    }
}