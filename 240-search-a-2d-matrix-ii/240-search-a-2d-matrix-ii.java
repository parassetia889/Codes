class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        
        int row = matrix.length;
        int col = matrix[0].length;
        
        int i = 0, j = col-1;
        
        while(i<row && j >=0)
        {
            if(target == matrix[i][j])
                return true;
            else if(target < matrix[i][j])
                j--;
            else
                i++;
        }
        return false;
    }
}