class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        int count = 0;
        int row = matrix.length;
        int col = matrix[0].length;
        int total = matrix.length * matrix[0].length;
        
        List<Integer> al = new ArrayList<Integer>();
        
        int startrow = 0, endrow = row-1;
        int startcol = 0, endcol = col-1;
        
        while(count < total)
        {
            //starting row
            for(int index = startcol;  count<total && index <=endcol; index++)
              {  al.add(matrix[startrow][index]);
                count++; }
            
            startrow++;
            
            //ending column
            for(int index = startrow;  count<total && index <= endrow; index++)
               { al.add(matrix[index][endcol]);
                count++; }
            
            endcol--;
            
            //ending row
            for(int index = endcol;  count<total && index>=startcol; index--)
              {  al.add(matrix[endrow][index]);
                count++; }
             
            endrow--;
            
            //starting column
            for(int index = endrow; count<total && index>=startrow; index--)
             {   al.add(matrix[index][startcol]);
                count++; }
            startcol++;
            
        }
        return al;
    }
}