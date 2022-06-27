class Solution {
    public int minPartitions(String n) {
        
        int ans = -1;
        for(char  ch : n.toCharArray() )
            ans = Math.max(ans, ch-'0');
        
        return ans;
    }
}