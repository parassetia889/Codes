class Solution {
    public String toLowerCase(String s) {
        
        String str = "";
        
        for(char ch : s.toCharArray()){
            
            if(Character.isUpperCase(ch))
                str += (char)(ch+32);
            else
                str += ch;
        }
           
        
        return str;
    }
}