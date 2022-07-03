class Solution {
    public int[] sortByBits(int[] arr) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> temp = new ArrayList<>();
        
        for(int i : arr){
            temp.add(i);
            map.put(i, bitsCount(i));
        }
        
        Collections.sort(temp, (a,b) ->
                         map.get(a) == map.get(b) ? a - b : map.get(a)-map.get(b));
        
        for(int i = 0; i < temp.size(); i++)
            arr[i] = temp.get(i);
        
        
        return arr;
    }
    
    public int bitsCount(int n){
        
        int count = 0;
        while(n != 0){
            
            if((n&1) == 1)
                count++;
            
            n = n>>1;
        }
        return count;
    }
}