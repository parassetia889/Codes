class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        
        List<List<Integer>> ans = new ArrayList<>();
        helper(new ArrayList<>(), k, n, ans, 1);
        
        return ans;
    }
    
    public void helper(List<Integer> li, int k, int n, List<List<Integer>> ans, int index){
        
        if(li.size() == k && n == 0 ){
            ans.add(new ArrayList<>(li));
            return;
        }
        
        if(li.size() > k || n < 0)
            return;
        
        for(int i = index; i <= 9; i++){
            li.add(i);
            helper(li, k, n-i, ans, i+1);
            li.remove(li.size()-1);
        }
        
    }
}