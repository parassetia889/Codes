class Solution {
    public int maxFrequency(int[] nums, int k) {
        
        int l = 0, r = 0, ans = 0;
        Arrays.sort(nums);
        long totalSum = 0;
        
        for(r = 0; r < nums.length; r++){
            totalSum += nums[r];
            
            while(nums[r] *(r-l+1) > totalSum + k){
                totalSum -= nums[l];
                l++;
            }
            ans = Math.max(ans, r-l+1);
        }
        return ans;
    }
}