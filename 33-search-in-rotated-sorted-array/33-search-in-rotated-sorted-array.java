class Solution {
    public int search(int[] nums, int target) {
        
        int s = 0, e = nums.length-1;
        
        while(s <= e){
            int mid = s + (e-s)/2;
            
            if(target == nums[mid])
                return mid;
            
            else if(nums[s] <= nums[mid]){  //first half is sorted
                
                if(target >= nums[s] && target<=nums[mid])
                    e = mid-1;
                else
                    s = mid + 1;
            }
             else{
                if(target > nums[mid] && target <= nums[e])
                    s = mid + 1;
                else
                    e = mid-1;
            }
        }
        return -1;
    }
}