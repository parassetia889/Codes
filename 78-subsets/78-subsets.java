class Solution {
    List<List<Integer>> ans;
    List<Integer> output;
    
     void solve(int[] nums, List<Integer> output, int index  )
    {
        
        //base case
        if(index >= nums.length){
            ans.add(new ArrayList<>(output));
            return;
        }
        
        //exclude
        solve(nums, output, index+1);
        
        //include
        int element = nums[index];
        output.add(element);
        solve(nums, output, index+1);
        output.remove(output.size()-1);
    }
    
    public List<List<Integer>> subsets(int[] nums) {
     
        ans = new ArrayList<>();
        output = new ArrayList<>();
        int index = 0;
        if(nums == null || nums.length == 0)
            return ans;
        
        solve(nums, output, index);
        
        return ans;
    }
}