class Solution {
    public String reverseWords(String s) {
        
        int lastSpace = -1;
        String str = "";
        
        for(int i = 0 ; i < s.length(); i++){
            
            if(i == s.length()-1 || s.charAt(i) == ' '){
                
                //reverse
                int revIndex = (i == s.length()-1) ? i : i-1;
                for( ; revIndex > lastSpace; revIndex--)
                    str += s.charAt(revIndex);
                 if (i != s.length() - 1) 
                   str += ' ';
                
                lastSpace = i;
            }
           
        }
        
        return str;
    }
}