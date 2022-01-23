class Solution {
    public List<Integer> findLonely(int[] nums) {
        
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();
        if(n == 1){
            ans.add(nums[0]);
        return ans;
        }
        Arrays.sort(nums);
        
        //for first element
        if(nums[0] != nums[1] && nums[1] != nums[0]+1)
            ans.add(nums[0]);
        
        //for last element
        if(nums[n-1] != nums[n-2] && nums[n-1] != nums[n-2]+1)
            ans.add(nums[n-1]);
        
        //for rest elements
        for(int i = 1; i < n-1; i++){
           if(nums[i] != nums[i-1] && nums[i]  != nums[i+1] && nums[i-1] != nums[i]-1 && nums[i]+1 !=   nums[i+1]) 
               ans.add(nums[i]);
        }
        
        return ans;
    }
}