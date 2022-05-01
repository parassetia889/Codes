class Solution {
    public int minimumAverageDifference(int[] nums) {
        
        long sum  = 0;
        int n = nums.length;
        for(int i : nums)
            sum += i;
        
        int ans = -1;
        long lSum = 0,  min = Integer.MAX_VALUE;
        
        for(int i = 0; i < nums.length; i++){
            lSum += nums[i];
            long avg = 0;
            
            if(i == (n-1))
                 avg = lSum/(i+1);
            else
                 avg = Math.abs(lSum/(i+1) - (sum - lSum)/(n-i-1));
            if(avg < min){
                min = avg;
                ans = i;
            }
            
        }
        return ans;
    }
}