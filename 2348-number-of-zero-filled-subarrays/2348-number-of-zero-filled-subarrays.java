class Solution {
    public long zeroFilledSubarray(int[] nums) {
        
        long ans = 0, local = 0;
        
        for(int i : nums){
            if(i == 0)
                local++;
            else
                local = 0;
            
            ans += local;
        }
        return ans;
    }
}