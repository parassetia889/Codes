class Solution {
    
    public int[][] largestLocal(int[][] grid) {
        
        int[][] ans = new int[grid.length-2][grid.length-2];
        
        for(int i = 0 ; i < ans.length; i++)
            for(int j = 0 ; j < ans.length; j++)
                ans[i][j] = maxLocal(grid,i,j);
        
        return ans;
    }
    
    
    private int maxLocal(int[][] grid, int s, int e){
     
        int max = Integer.MIN_VALUE;
        
        for(int i = s ; i < (s+3); i++)
            for(int j = e ; j < (e+3); j++)
                max = Math.max(grid[i][j], max);
        
        return max;
    }
}