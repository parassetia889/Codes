class Solution {
    public int equalPairs(int[][] grid) {
        
        
        int count = 0;
        
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i = 0 ; i < grid.length; i++){
            String str = "";
            for(int j = 0 ; j < grid[0].length; j++)
                str += grid[i][j] +",";
            
            map.put(str, map.getOrDefault(str,0)+1);
            
        }
        
        
        for(int i = 0 ; i < grid.length; i++){
            
            String str = "";
            for(int j = 0; j < grid[0].length; j++)
                str += grid[j][i] +",";
            
            if(map.containsKey(str))
                count += map.get(str);
        }
        
        return count;
    }
}