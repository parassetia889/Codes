class Solution {
    public List<Integer> intersection(int[][] nums) {
        
      
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int[] num : nums){
            for(int i : num){
                map.put(i, map.getOrDefault(i, 0)+1);
            }
        }
        
        List<Integer> list = new ArrayList<>();
        for(Map.Entry entry : map.entrySet()){
            if((int)entry.getValue() == nums.length)
                list.add((int)entry.getKey());
        }
        Collections.sort(list);
    return list;
    }
    
}


// map.put(i, map.getOrDefault(i,0)+1)