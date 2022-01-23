class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        int[] temp = new int[nums.length];
        int j = 0, k = 1;
        for(int i = 0; i<nums.length; i++)
        {
            if(nums[i] > 0 )
            {
                temp[j] = nums[i];
                j = j+2;
            }
            else
            {
                temp[k] = nums[i];
                k += 2;
            }
        }
        
        return temp;
    }
}