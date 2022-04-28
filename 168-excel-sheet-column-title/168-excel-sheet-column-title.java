class Solution {
    public String convertToTitle(int columnNumber) {
        
        String s = "";
       
        
        
        while(columnNumber > 0){
            
               columnNumber--;
            
            s = (char)(columnNumber%26 + 65) + s;   //Y
            
      
            columnNumber /= 26; //26
        }
        
        return s;
    }
}