class Solution {
    public int myAtoi(String s) {
        
        String str = s.trim();
        if(str.length() == 0 || str == null)
                return 0;
        
        
        
        boolean flag = false;
        
        if(str.charAt(0) == '-'){ 
            flag = true;
            str = str.substring(1);
        }
        else if(str.charAt(0) == '+')
            str = str.substring(1);
            
        
        double ans = 0;
        
        for(int i = 0; i < str.length(); i++){
            
            char c = str.charAt(i);
            if(c >= '0' && c <= '9')
                ans = ans*10 + (c-'0');
            
            else
                break;
        }
        
        ans = flag ? -ans : ans;
        
        if(ans > Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        
        else if(ans < Integer.MIN_VALUE)
            return Integer.MIN_VALUE;
        
        return (int)ans;
            
    }
}