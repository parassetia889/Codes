class Solution {
    public int findClosestNumber(int[] nums) {
        
        
        int min = Integer.MAX_VALUE;
        
        for(int i : nums){
            
            if(Math.abs(i) < Math.abs(min))
                min = i;
            else if(Math.abs(i) == Math.abs(min))
                min = Math.max(i, min);
        }
        
        return min;
    }
}