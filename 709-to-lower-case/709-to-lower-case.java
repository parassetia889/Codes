class Solution {
    public String toLowerCase(String s) {
        
        String str = "";
        
        for(char ch : s.toCharArray())
            str += Character.toLowerCase(ch);
        
        return str;
    }
}