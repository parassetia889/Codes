class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
      
        List<Integer> al = new ArrayList<>();
        
        int row = matrix.length;
        int col = matrix[0].length;
        int total = row * col;
        int count = 0;
        
        int startRow = 0, endRow = row-1;
        int startCol = 0, endCol = col-1;
        
        while(count < total){
            
            //firstRow
            for(int i = startCol; i<=endCol && count<total;  i++){
                al.add(matrix[startRow][i]);
                count++;
            }
            startRow++;
            
            //lastCol
            for(int i = startRow; i<=endRow && count<total;  i++){
                al.add(matrix[i][endCol]);
                count++;
            }
            endCol--;
            
            
            //lastRow
            for(int i = endCol; i >= startCol && count<total;  i--){
                al.add(matrix[endRow][i]);
                count++;
            }
            endRow--;
            
            //startCol
            for(int i = endRow; i >= startRow && count<total;  i--){
                al.add(matrix[i][startCol]);
                count++;
            }
            startCol++;
        }
        
        
        return al;
    }
}