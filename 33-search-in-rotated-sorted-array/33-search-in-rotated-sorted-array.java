class Solution {
    public int getPivot(int nums[]){
        
        int s = 0, e = nums.length - 1;
        
        while(s < e){
            int mid = s + (e-s)/2;
            
            if(nums[mid] >= nums[0])
                s = mid+1;
            else 
                e = mid;
        }
        
        return s;
    }
    
    public int search(int nums[],int s,int e, int key){
        
        
        while(s <= e){
            int mid = s + (e-s)/2;
            
            if(key == nums[mid])
                return mid;
            else if(key < nums[mid])
                e = mid - 1;
            else
                s = mid + 1;
        }
        
        return -1;
    }
    
    public int search(int[] nums, int target) {
        
        int pivot = getPivot(nums);
        int ans = -1, n = nums.length;
        
        if(target >= nums[pivot]  && target <= nums[n-1] )
            ans = search(nums, pivot, n-1, target);
        else
            ans = search(nums,0, pivot-1, target);
        
        return ans;
    }
}