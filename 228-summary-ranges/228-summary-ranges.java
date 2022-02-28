class Solution {
    public List<String> summaryRanges(int[] nums) {
        
        List<String> ret = new ArrayList<>();
        
        if (nums.length == 0) return ret;
        
        int n = nums.length;
        int start = nums[0];
        for (int i = 1; i < n; i++) {
            
            if (nums[i-1] + 1 != nums[i]) {
                
                StringBuilder sb = new StringBuilder();
                if (nums[i-1] != start) {
                    sb.append(start).append("->").append(nums[i-1]);
                } else {
                    sb.append(start);
                }
                
                ret.add(sb.toString());
                start = nums[i];
            }
        }
        
        if (start == nums[n-1]) {
            ret.add(String.valueOf(start));
        } else {
            ret.add(start + "->" + nums[n-1]);
        }
        
        return ret;
    }
}