class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        
        int max = 0;
        
        for(int i = 0; i<grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 1)
                    max = Math.max(dfs(i, j, grid), max);
            }
            
            
        }
        
        return max;
    }
    
    
    public int dfs(int i , int j, int[][] grid){
        
        if(i >= grid.length || i < 0 || j >= grid[0].length || j < 0
          || grid[i][j] == 0)
            return 0;
        
        grid[i][j] = 0;
        return 1 + (dfs(i, j+1, grid) +  dfs(i, j-1, grid) + dfs(i-1, j, grid) + dfs(i+1, j , grid));
    }
}