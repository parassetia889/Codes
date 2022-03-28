class Solution {
    public int minDeletion(int[] nums) {
        
        
        int count = 0;
        int i = 0;
        
        while(i < nums.length-1){
            if((i-count)%2 == 0 && nums[i] == nums[i+1])
                count++;
            i++;
        }
        return (nums.length-count)%2 == 0 ? count : ++count;
    }
}