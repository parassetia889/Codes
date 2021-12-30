class Solution {
    public int findMin(int[] nums) {
        
        if(nums.length == 1)
            return nums[0];
        
        int s = 0, e = nums.length-1;
        if(nums[e] > nums[s])
                return nums[s];
        
        while(s <= e)
        {
    
            int mid = s + (e-s)/2;
            
            if(nums[mid] > nums[mid+1])
                return nums[mid+1];
          
             if(nums[mid-1] > nums[mid])
                return nums[mid];
            
            if(nums[mid] > nums[0])
                s = mid+1;
            else
                e = mid-1;
            
           
            
        }
        return -1;
    }
}