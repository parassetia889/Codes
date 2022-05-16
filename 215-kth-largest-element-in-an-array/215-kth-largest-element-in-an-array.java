class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        int n = nums.length;
        int l =0, r = n-1;
        while(l <= r){
            
            int p = partition(nums,l, r);
            if(p == (n-k))
                return nums[p];
            else if(p < (n-k))
                l = p+1;
            else
                r  = p-1;
        }
        return -1;
    }
    
    public int partition(int[] nums, int l, int r){
        
        int pivot = nums[r];
        int i = l-1;
        
        for(int j = l; j < r; j++){
            
            if(nums[j] < pivot){
                i++;
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        
        int temp = nums[i+1];
        nums[i+1] = pivot;
        nums[r] = temp;
        
        return i+1;
    }
}