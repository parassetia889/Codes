class Solution {
    public int minMoves2(int[] nums) {
        
        
        Arrays.sort(nums);
        int count = 0, mid = nums[nums.length/2];
        
        for(int num : nums)
            count += Math.abs(num-mid);
        
        return count;
    }
}