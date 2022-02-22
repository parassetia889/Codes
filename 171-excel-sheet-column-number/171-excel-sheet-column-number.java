class Solution {
    public int titleToNumber(String columnTitle) {
        int ans = 0;
        String s = columnTitle;
        
        int p = 0;
        for(int i = s.length()-1; i >=0; i--){
            ans += (int)Math.pow(26,p) * (s.charAt(i) - 'A'+1);
            p++;
        }
        
        return ans;
    }
}