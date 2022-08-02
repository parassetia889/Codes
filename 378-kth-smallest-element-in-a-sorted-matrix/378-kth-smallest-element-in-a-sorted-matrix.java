class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        
        int row = matrix.length, col = matrix[0].length;
        int l = matrix[0][0], r = matrix[row-1][col-1];
        
        while(l <= r){
            
            int mid = l + (r-l)/2;
            int count = getCount(matrix, mid, row, col);
            
            if(count < k)
                l = mid+1;
            else
                r = mid-1;
        }
        return l;
    }
    
    
    private int getCount(int[][] matrix, int val, int rows, int col){
        
        int r = rows-1, c = 0, count = 0;
        
        while(-1 < r && c < col){
            if(val < matrix[r][c])
                r--;
            else{
                count += r+1;
                c++;
            }
        }
        return count;
    }
}