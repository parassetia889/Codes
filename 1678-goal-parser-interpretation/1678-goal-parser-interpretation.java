class Solution {
    public String interpret(String command) {
        
        String str = "";
        
        int i = 0;
        while(i < command.length()){
            
            if(command.charAt(i) == 'G')
                str += "G";
            else if(command.charAt(i) == '(' ){
                
                if(command.charAt(i+1) == ')')
                     str += "o";
                else if(command.charAt(i+1) == 'a' && command.charAt(i+2) == 'l' && command.charAt(i+3) == ')')
                    str += "al";
            }
                
                
            i++;
        }
        
        return str;
    }
}