class Solution {
    public int[] numberOfPairs(int[] nums) {
     
    HashMap<Integer, Integer> map = new HashMap<>();
    int[] answer = new int[2];
        
        for(int num : nums)
            map.put(num, map.getOrDefault(num,0)+1);
        
        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            
                answer[0] += e.getValue()/2;
            if(e.getValue()%2 != 0)
                answer[1] +=  e.getValue()%2;
        }
        
        return answer;
    }
}

 