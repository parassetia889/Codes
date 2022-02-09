import java.util.*;
class Solution {
    public int findPairs(int[] nums, int k) {
        
        
        HashSet<Integer> set  = new HashSet<>();
        Arrays.sort(nums);
        
        for(int i = 0; i < nums.length; i++){
            if(Arrays.binarySearch(nums, i+1, nums.length, nums[i]+k) > 0)
                set.add(nums[i]);
        }
        
        return set.size();
    }
}