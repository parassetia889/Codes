class Solution {
   int dp[];
    public int fib(int n) {
        
            dp = new int[n+1];
            Arrays.fill(dp,-1);
    return fibo(n);
    }
    
    public int fibo(int n){
        if(n <= 1)
            return n;
        
        if(dp[n] != -1)
            return dp[n];
        
        
        return  (dp[n] = fibo(n-1) + fibo(n-2));
    }
}