class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        
        Set<Character> set = new HashSet<>();
        for(char ch : suits)
            set.add(ch);
        
        if(set.size() == 1)
            return "Flush";
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i : ranks){
            map.put(i, map.getOrDefault(i,0)+1);
            
            if(map.get(i) == 3)
                return "Three of a Kind";}
        
        
        return map.containsValue(2) ? "Pair" : "High Card";
  
    }
}