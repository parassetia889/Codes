class Solution {
    public int findDuplicate(int[] nums) {
        return store(nums, 0);
    }
    
    public int store(int[] nums, int curr){
        if(curr == nums[curr])
            return curr;
        
        int next = nums[curr];
        nums[curr] = curr;
       return  store(nums, next);
    }
}