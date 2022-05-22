class Solution {
    public int countSubstrings(String s) {
    
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            for(int j = i; j < s.length(); j++){
                if(isPallindrome(s,i,j))
                    count++;
            }
            
        }
        return count;
    }
    
    public boolean isPallindrome(String str, int i, int j){
        
        while(i<=j){
            if(str.charAt(i) != str.charAt(j))
                return false;
            i++; j--;
        }
        return true;
    }
}