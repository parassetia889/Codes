class Solution {
    public int titleToNumber(String columnTitle) {
        
        int p = 0;
        
        for(char c : columnTitle.toCharArray()){
            
            p *= 26;
            p += (c-'A')+1;
        }
        
        return p;
    }
}