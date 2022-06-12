class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        
       
        Set<Integer> set = new HashSet<>();
        int sum = 0, ans = Integer.MIN_VALUE;
        int n = nums.length;
        
        for(int l = 0, r = 0; r < n; r++){
            
            while( set.contains(nums[r])){
                sum -= nums[l];
                set.remove(nums[l++]);
            }
            
            set.add(nums[r]);
            sum += nums[r];
            ans = Math.max(ans, sum);
        }
        return ans;
    }
}