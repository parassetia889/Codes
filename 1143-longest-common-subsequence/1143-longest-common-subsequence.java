class Solution {
     int[][] t = new int[1001+1][1001+1];
     
    public int longestCommonSubsequence(String text1, String text2) {
        
        for (int i = 0; i < t.length; i++){
        Arrays.fill(t[i], -1);
    }
        return lcs(text1, text2, text1.length(), text2.length());
    }
    
    private int lcs(String s1, String s2, int n, int m){
        if(n==0 || m==0)
            return 0;
        if(t[n][m] != -1)
            return t[n][m];
                       
        //last matching
        if(s1.charAt(n-1) == s2.charAt(m-1))
            return t[n][m] = 1+lcs(s1,s2,n-1, m-1);
        
        //last not matching
        else
            return t[n][m] = Math.max( lcs(s1,s2,n, m-1), lcs(s1,s2,n-1, m));
    }
}