class Solution {
    public int minimumCardPickup(int[] cards) {
        
        int ans = Integer.MAX_VALUE;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0 ; i < cards.length; i++){
            int val = cards[i];
            
            if(map.containsKey(val) && (i-map.get(val)+1)< ans)
                ans = i-map.get(val)+1;
            else
                map.put(val,i);
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}