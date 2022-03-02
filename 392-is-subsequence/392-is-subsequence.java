class Solution {
    public boolean isSubsequence(String s, String t) {
        
        int i = 0, j = 0, n1 = s.length(), n2 = t.length();
        if(n1 > n2)
            return false;
        if(n1 == 0 && n2 == 0)
            return true;
       
        while(i < n1 && j < n2){
            
            if(s.charAt(i) == t.charAt(j))
            {    i++;
                j++;}
            else
                j++;
        }
        return (i < n1) ? false : true;
    }
}