class Solution {
    public int maxSubArray(int[] nums) {
        
        int sum = 0;
        int maxi = nums[0];
        
        for(int i : nums){
            sum += i;
            if(sum > maxi)  maxi = sum;
            if(sum < 0 )    sum = 0;
        }
        return maxi;
    }
}