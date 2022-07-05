class Solution {
    public int longestConsecutive(int[] nums) {
        
        if(nums.length == 0)
            return 0;
        
        Arrays.sort(nums);
        
        int maxLen = 1, currLen = 1;
        for(int i = 1; i < nums.length; i++){
            
            if(nums[i] != nums[i-1]){
                
                if(nums[i] == nums[i-1] + 1)
                    currLen++;
                else{
                    maxLen = Math.max(maxLen, currLen);
                    currLen = 1;
                }
            }
        }
        
        return Math.max(currLen, maxLen);
        
    }
}