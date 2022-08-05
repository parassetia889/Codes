class Solution {
    
    public int combinationSum4(int[] nums, int target) { 
       return solveTab(nums, target);
    }
    
    
//     private int solve(int[] nums, int target, int[] dp){
        
//         if(target == 0)
//             return 1;
        
//         if(target < 0)
//             return 0;
        
//         if(dp[target] != -1)
//             return dp[target];
        
        
//         int ans = 0;
//         for(int i : nums)
//             ans += solve(nums, target-i, dp);
        
//         dp[target] = ans;
//         return dp[target];
//     }
    
    private int solveTab(int[] nums, int tar){
        
        int[] dp = new int[tar+1];
        Arrays.fill(dp, 0);
        
        dp[0] = 1;
        
        //traversing from target 1 to tar
        for(int i = 0 ; i <=tar; i++){
            
            //traversing on nums array
            for(int j : nums){
                if(i - j >= 0)
                    dp[i] += dp[i-j];
            }
        }
        return dp[tar];
    }
}
