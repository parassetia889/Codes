class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        int total = matrix.length * matrix[0].length;
        int count = 0;
        int row = matrix.length;
        int col = matrix[0].length;
        
        List<Integer> al = new ArrayList<Integer>();
        
        int startRow = 0, endRow = row-1;
        int startCol = 0, endCol = col-1;
        
        while(count < total){
            
            //firstRow
            for(int i = startCol; count < total && i<= endCol ; i++){
                al.add(matrix[startRow][i]);
                count++;
            }
            startRow++;
            
            //lastCol
             for(int i = startRow; i<= endRow && count < total; i++){
                al.add(matrix[i][endCol]);
                count++;
            }
            endCol--;
            
            //lastRow
             for(int i = endCol; i >= startCol && count < total; i--){
                al.add(matrix[endRow][i]);
                count++;
            }
            endRow--;
            
            //firstCol
             for(int i = endRow; i >= startRow && count < total; i--){
                al.add(matrix[i][startCol]);
                count++;
            }
            startCol++;
        }
        return al;
    }
}
