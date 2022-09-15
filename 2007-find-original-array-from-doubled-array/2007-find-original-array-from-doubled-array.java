class Solution {
    public int[] findOriginalArray(int[] changed) {
        
        int n = changed.length;
        if((n&1) != 0)  
            return new int[0];
        
        Arrays.sort(changed);
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i : changed)
            map.put(i, map.getOrDefault(i,0)+1);
        
        int res[] = new int[n/2], k=0;
        
        for(int i : changed){
            
            if(map.containsKey(i)){
                
                if(map.containsKey(i*2)){
                    res[k++] = i;
                
                map.put(i, map.get(i)-1);
                map.put(i*2, map.get(i*2)-1);
                
                if(map.get(i)<=0) map.remove(i);
                if(map.containsKey(i*2) && map.get(i*2)<=0) map.remove(i*2);
                
            }else
                return new int[0];
        }
        }
        return res;
    }
    
}