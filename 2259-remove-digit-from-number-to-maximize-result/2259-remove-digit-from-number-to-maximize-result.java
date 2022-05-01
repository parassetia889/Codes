class Solution {
    public String removeDigit(String number, char digit) {
        
        String ans = "";
        
        for(int i = 0; i < number.length(); i++){
            if(number.charAt(i) == digit){
                String curr = number.substring(0,i) + number.substring(i+1);
                if(curr.compareTo(ans) > 0)
                    ans = curr;
            }
        }
        
        return ans;
    }
}