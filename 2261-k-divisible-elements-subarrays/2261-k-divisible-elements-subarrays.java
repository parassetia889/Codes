class Solution {
    public int countDistinct(int[] nums, int k, int p) {
        
        
        Set<String> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            StringBuilder sb = new StringBuilder();
            int c = 0;
            
            for(int j = i; j < nums.length; j++){
                sb.append(String.valueOf(nums[j])+",");
                if(nums[j] % p == 0)
                    c++;
                
                if(c <= k)
                    set.add(sb.toString());
            }
        }
        
        return set.size();
    }
}