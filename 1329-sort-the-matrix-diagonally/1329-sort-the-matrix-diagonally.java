class Solution {
    public int[][] diagonalSort(int[][] mat) {
        
        int rows = mat.length;
        int cols = mat[0].length;
        
        for(int i = cols-1; i>=0; i--){
            int len = Math.min(cols-i, Math.min(rows,cols));
            
            int temp[] = new int[len];
            
            for(int row=0, col=i, index=0;  index<len; row++, col++, index++){
                temp[index] = mat[row][col];
            }
            
            Arrays.sort(temp);
             for(int row=0, col=i, index=0;  index<len; row++, col++, index++){
                 mat[row][col] = temp[index];
            }
        }
        
        for(int i = 1; i < rows; i++){
            
            int len = Math.min(rows-i, Math.min(rows, cols));
            int temp[] = new int[len];
            
            for(int row = i, col = 0, ind = 0; ind < len; row++, col++, ind++){
                temp[ind] = mat[row][col];
            }
            Arrays.sort(temp);
            
            
            for(int row = i, col = 0, ind = 0; ind < len; row++, col++, ind++){
                mat[row][col] = temp[ind];
            }
        }
        return mat;
    }
}