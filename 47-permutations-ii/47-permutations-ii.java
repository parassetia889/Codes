class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        
        Set<List<Integer>> res = new HashSet<>();
        solve(nums, 0, nums.length, res);
        List<List<Integer>> ans = new ArrayList<>(res);
        return ans;
        
    }
    
    private static void solve(int[] nums, int start, int end, Set<List<Integer>> res){
        if(start == end){
            ArrayList temp = new ArrayList<>();
            for(int i : nums)
                temp.add(i);
            
            res.add(temp);
            return ;
        }
        
        for(int i = start; i < end; i++){
            swap(nums, start, i);
            solve(nums, start+1, end, res);
            swap(nums, start, i);
        }
    }
    
    private static void swap(int[] nums ,int i, int j){
        
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}