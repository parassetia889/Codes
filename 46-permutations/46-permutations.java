class Solution {
    
    public void solve(int[] nums, List<List<Integer>> ans, int index){
        if(index >= nums.length){
            ans.add(toList(nums));
            return;
        }
        
        for(int i = index; i<nums.length; i++){
            swap(nums,index,i);
            solve(nums, ans, index+1);
                
                //backtrack
             swap(nums,index,i);    
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int index = 0;
        solve(nums, ans, index);
        return ans;
    }
    
    public List<Integer> toList(int[] nums){
        List<Integer> res = new ArrayList<>();
        for(int i:nums)
            res.add(i);
        
        return res;
    }
    
    public void swap(int[] nums,int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}