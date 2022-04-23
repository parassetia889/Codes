class Solution {
    public int minSubArrayLen(int target, int[] nums) {
       
        
        int n = nums.length;
        int ans = Integer.MAX_VALUE;
        
        int left = 0, sum = 0;
        
        for(int i = 0; i<n; i++){
            
            sum += nums[i];
            while(sum >= target){
                ans = Math.min(ans, i-left+1);
                sum -= nums[left];
                left++;
            }
        }
    
        return  (ans == Integer.MAX_VALUE) ? 0 : ans;
    }
}