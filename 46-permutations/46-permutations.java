import java.util.*;
class Solution {
    public void solve(int[] nums, int index, List<List<Integer>> ans )
    {
     if(index >= nums.length){
        ans.add(Arrays.stream(nums).boxed().collect(Collectors.toList()));
         return ;
       }
         
 
        for(int i = index; i<nums.length; i++)
        {
            swap(nums,index,i);
            solve(nums, index+1, ans);
            //backtrack
             swap(nums,index,i);
        }
            
    }
   public void swap(int[] a, int i, int j) {
    int temp = a[i];
    a[i] = a[j];
    a[j] = temp;
}
    
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int index = 0 ;
        solve(nums, index, ans);
        
        return ans;
        
    }
}