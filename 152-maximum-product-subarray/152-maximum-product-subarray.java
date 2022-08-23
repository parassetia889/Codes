class Solution {
    public int maxProduct(int[] nums) {
        
        int ans = 1, maxPro = nums[0];
        
        for(int i : nums){
            ans *= i;
            
            maxPro = Math.max(ans, maxPro);
            
            if(ans == 0)
                ans = 1;
        }
        
        ans = 1;
        for(int i = nums.length-1; i>=0 ; i--){
            ans *= nums[i];
            
            maxPro = Math.max(ans, maxPro);
            
            if(ans == 0)
                ans = 1;
        }
        
        return maxPro;
    }
}