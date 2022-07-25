class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int[] ans = new int[2];
        ans[0] = firstIndex(nums, target);
        ans[1] = lastIndex(nums, target);
        
        return ans;
    }
    
    private static int firstIndex(int[] nums, int target){
        int fi= -1;
        int s = 0, e = nums.length-1;
        
        while(s <= e){
            
            int mid = s + (e-s)/2 ;
            
            if(nums[mid] == target){
                fi = mid;
                e = mid-1;
            }
            else if(nums[mid] > target)
                e = mid - 1;
            else
                s = mid + 1;
                
        }
        return fi;
        
    }
    
    private static int lastIndex(int[] nums, int target){
        
        int ei = -1;
        int s = 0, e = nums.length-1;
        
        while(s <= e){
            
            int mid =s +  (e-s)/2;
            
            if(nums[mid] == target){
                ei = mid;
                s = mid + 1;
            }
            else if(nums[mid] > target)
                e = mid - 1;
            else
                s = mid + 1;
                
        }
        return ei;
    }
}