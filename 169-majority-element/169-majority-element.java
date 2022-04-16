class Solution {
    public int majorityElement(int[] nums) {
        
        int count = 0;
        Integer candidate = null;
        
        for(int i : nums){
            
            if(count == 0)
                candidate = i;
            
            count += (i == candidate) ? 1 : -1;
         }
        
        return candidate;
    }
}