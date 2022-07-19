class Solution {
    public int[] numberOfPairs(int[] nums) {
        
        Set<Integer> set = new HashSet<>();
        int count = 0;
        
        for(int num : nums){
            
            if(set.contains(num)){
                set.remove(num);
                count++;
            }
             else set.add(num);
        }
               
        return new int[]{count, set.size()};
    }
}