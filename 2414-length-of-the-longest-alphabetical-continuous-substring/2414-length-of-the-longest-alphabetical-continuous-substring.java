class Solution {
    public int longestContinuousSubstring(String s) {
       
        int j = 0, ans = 1;
        
        for(int i = 1; i < s.length(); i++){
            
            if(s.charAt(i) != s.charAt(i-1)+1)
               j = i;
            
            ans = Math.max(ans, i-j+1);
        }
        return ans;
    }
}