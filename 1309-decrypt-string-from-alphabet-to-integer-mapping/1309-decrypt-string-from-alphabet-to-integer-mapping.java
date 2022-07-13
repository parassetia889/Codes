class Solution {
    public String freqAlphabets(String s) {
        
        String str = "";
        int n = s.length();
        
        for(int i = 0; i < n;){
            
            if(i+2 < n && s.charAt(i+2) == '#'){
                
                int num = Integer.parseInt(s.substring(i,i+2));
                //10
                char ch = (char)(num+96);
                str += ch;
                i += 3;
            }
            
            else{
                
                char ch = (char)(s.charAt(i) - '0'  + 96);
                str += ch;
                i++;
            }
        }
        
        return str;
    }
}