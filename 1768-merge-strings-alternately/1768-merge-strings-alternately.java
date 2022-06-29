class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        String str = "";
        
        int i = 0, j = 0;
        while(i < word1.length() && j < word2.length()){
            
            str = str + word1.charAt(i) + word2.charAt(j);
            i++; j++;
        }
        
        if(i < word1.length())
            str += word1.substring(i);
        
       if(j < word2.length())
            str += word2.substring(j);
        
        
        return str;
    }
}