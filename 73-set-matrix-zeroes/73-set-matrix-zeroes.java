class Solution {
    public void setZeroes(int[][] matrix) {
        
        int row = matrix.length, col = matrix[0].length;
        int dummyC[] = new int[col];
        int dummyR[] = new int[row];
        
        Arrays.fill(dummyC, -1);
        Arrays.fill(dummyR, -1);
        
        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                
                if(matrix[i][j] == 0){
                    dummyR[i] = 0;
                    dummyC[j] = 0;
                }
            }
        }
        
        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                
                if(dummyR[i] == 0 || dummyC[j] == 0)
                    matrix[i][j] = 0;
            }
        }
        
    }
}