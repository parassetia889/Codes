class Solution {
    
    public int mostFrequentEven(int[] nums) {
        
        TreeMap<Integer, Integer> map = new TreeMap<>();
        int val = Integer.MAX_VALUE, maxFreq = 0, currFreq = 0;
        
        for(int i : nums){
            if(i%2 == 0){
                currFreq =  map.getOrDefault(i,0)+1;
                map.put(i,currFreq);  
                
            if(currFreq > maxFreq || (currFreq == maxFreq && i < val)){
                val = i;
                maxFreq = currFreq;
            }}
        }
        
        return maxFreq == 0 ? -1 : val;
    }
}