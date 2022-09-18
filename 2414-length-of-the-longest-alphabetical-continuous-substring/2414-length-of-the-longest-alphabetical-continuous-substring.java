class Solution {
    public int longestContinuousSubstring(String s) {
        
        int i = 1, j = 0, ans = 1;
        
        while(i < s.length()){
            
            if(s.charAt(i)-'a' != s.charAt(i-1)-'a'+1)
                j = i;
            
                ans = Math.max(ans, i-j+1);
            
                i++;
        }
        return ans;
    }
}