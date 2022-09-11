class Solution {
    
    public int mostFrequentEven(int[] nums) {
        
        TreeMap<Integer, Integer> map = new TreeMap<>();
       
        for(int i : nums){
            if(i%2 == 0)
                map.put(i, map.getOrDefault(i,0)+1);    
        }
        
        int ans = -1, max = Integer.MIN_VALUE;
        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            if(e.getValue() > max){
                max = e.getValue();
                ans = e.getKey();
            }
        }
        
        return ans;
    }
}