class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int larr[] = new int[nums.length];
        int rarr[] = new int[nums.length];
        
        int p = 1;
        for(int i = 0; i<nums.length; i++){
            larr[i] = p;
            p *= nums[i];
        }
        
         p = 1;
        for(int i = nums.length-1; i>=0; i--){
            rarr[i] = p;
            p *= nums[i];
        }
        
        
        for(int i=0; i<nums.length; i++){
            nums[i] = larr[i] * rarr[i];
        }
        return nums;
    }
}