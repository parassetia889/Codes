class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        
        int sum = 0;
        for(int i : nums)
            sum += i;
        
        if(Math.abs(target) > sum || (sum+target)%2 != 0)
            return 0;
        
        int ans = findWays(nums, (sum+target)/2);
        return ans;
    }
    
    
    private int findWays(int[] nums, int sum){
        
        int n = nums.length;
        int t[][] = new int[n+1][sum+1];
        
        t[0][0] = 1;
        
        for(int i = 1; i <= sum; i++)
            t[0][i] = 0;
        
        for(int i = 1; i <= n; i++){
            for(int j = 0 ; j <= sum; j++){
                
                t[i][j] = t[i-1][j];
                
                if(nums[i-1] <= j)
                    t[i][j] = t[i-1][j] + t[i-1][j-nums[i-1]];
            }
        }
        
        return t[n][sum];
    }
}