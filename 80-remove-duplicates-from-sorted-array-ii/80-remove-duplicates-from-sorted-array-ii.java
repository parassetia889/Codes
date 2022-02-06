class Solution {
    public int removeDuplicates(int[] nums) {
        
        
        int i = 2;
        int n = nums.length;
        
        for(int j = 2; j < n; j++, i++){
            while(j < n && nums[j] == nums[i-1] && nums[j] == nums[i-2] )
                j++;
            
            if(j == n)
                break;
            
            nums[i] = nums[j];
        }
        
        return Math.min(i,n);
    }
}