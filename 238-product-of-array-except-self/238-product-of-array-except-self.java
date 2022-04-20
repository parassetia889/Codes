class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int arr[] = new int[nums.length];
        int count = 0;
        int p = 1;
        
        for(int i : nums){
            if(i == 0)
                count++;
            else
                p *= i;
        }
        
        if(count > 1)
            return arr;
        
        else
        {
            for(int i = 0; i<nums.length; i++){
                if(count == 0)
                    arr[i] = p/nums[i];
                else
                {
                    if(nums[i] == 0)
                        arr[i] = p;
                    else
                        arr[i] = 0;
                }
            }
        }
        
        return arr;
    }
}