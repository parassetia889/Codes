class Solution {
    public int compress(char[] chars) {
        
        
        
        if(chars.length == 1)
            return 1;
        
        String ans = chars[0]+"";
        int count = 1;
        
            
        for(int i = 1; i<chars.length; i++){
            
            if(chars[i] != chars[i-1]){
                
                if(count > 1){
                    ans += count;
                    count = 1;
                    }
                
                ans += chars[i];
                
            }
            else
                count++;
            
           }
        if(count > 1)
            ans += count;
        
        
        
        for(int i = 0; i<ans.length(); i++){
            
            chars[i] = ans.charAt(i);
        }
            
        return ans.length();
    }
}