class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
    
        int row = matrix.length, col = matrix[0].length;
        int total = row*col, count = 0;
        
        List<Integer> al = new ArrayList<>();
        int startRow = 0, endRow = row-1;
        int startCol = 0, endCol = col-1;
        
        
        while(count < total){
            
            //firstRow
            for(int ind = startCol;  count<total && ind<=endCol; ind++ ){
                al.add(matrix[startRow][ind]);
                count++;
            } 
            startRow++;
            
            //lastColumn
            for(int ind = startRow; count < total && ind<=endRow; ind++){
                al.add(matrix[ind][endCol]);
                count++;
            }
            endCol--;
            
            //lastRow
            for(int ind = endCol; ind >= startCol && count<total; ind--){
                al.add(matrix[endRow][ind]);
                count++;
            }
            endRow--;
            
            //firstColumn
            for(int ind = endRow; ind >= startRow && count<total; ind--){
                al.add(matrix[ind][startCol]);
                count++;
            }
            startCol++;
            
        }
        return al;
    }
}