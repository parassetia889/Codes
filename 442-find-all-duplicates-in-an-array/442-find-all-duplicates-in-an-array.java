class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        Set<Integer> seen = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        
        for(int i : nums){
            if(seen.contains(i))
                list.add(i);
            else
                seen.add(i);
        }
        return list;
    }
}