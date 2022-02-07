class Solution {
    public char findTheDifference(String s, String t) {
        
        char ch = 0;
        
        for(char cs : s.toCharArray())
            ch = (char)(ch ^ cs);
        
         for(char ct : t.toCharArray())
            ch = (char)(ch ^ ct);
        
        return ch;
    }
}