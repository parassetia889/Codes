class Solution {
    public String convertToTitle(int columnNumber) {
        String ans = "";
        int num = columnNumber;
        
        while(num != 0){
            int rem = num%26;
            
            if(rem == 0){
                ans = 'Z' + ans;
                num = num/26-1;
            }
            else{
                char ch = (char)('A' + rem -1);
                ans = ch + ans;
                 num /= 26;
            }
            
           
        }
        
        return ans;
    }
}