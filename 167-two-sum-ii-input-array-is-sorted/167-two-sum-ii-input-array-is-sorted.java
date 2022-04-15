class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        
        for(int i =  0; i<nums.length; i++){
            
            int j = binarySearch(nums, target-nums[i], i+1, nums.length-1);
            if(j != -1)
                return new int[]{i+1, j+1};
        }
        
        throw new IllegalArgumentException("No such Pair");
    }
    
    public int binarySearch(int[] nums, int key, int s, int e){
        
        while(s <= e){
            int mid = s + (e-s)/2;
            
            if(nums[mid] == key)
                    return mid;
            else if(nums[mid] < key)
                s = mid+1;
            else
                e = mid-1;
        }
        
        return -1;
    }
}