class Solution {
    public String longestPalindrome(String str) {
        
        int n = str.length();
        boolean[][] dp = new boolean[n][n];
        int len = 0;
        String ans = "";
        for(int g=0; g<n; g++){
            
            for(int i=0, j=g; j < n; j++, i++){
                if(g == 0)
                    dp[i][j] = true;
                else if(g == 1){
                    if(str.charAt(i) == str.charAt(j))
                        dp[i][j] = true;
                    else
                        dp[i][j] = false;
                }
                else{
                    //extremes are equal and inner part is also pallindromic
                    if(str.charAt(i) == str.charAt(j) && dp[i+1][j-1] == true)
                        dp[i][j] = true;
                    else
                         dp[i][j] = false;
                }
                if( dp[i][j] ){
                  len = g+1;
                    ans = str.substring(i,j+1);
                }
                
            }
            
            
        }
         return ans;
    }
    
   
}