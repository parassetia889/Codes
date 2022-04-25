class Solution {
    public void gameOfLife(int[][] board) {
        
        int row = board.length, col = board[0].length;
        int[][] temp = new int[row][col];
        
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                
              int count = 0;
              if(i-1 >= 0  && j-1 >= 0)//N-W
                  count = board[i-1][j-1] == 1 ? count+1 : count;
                
               if(i-1 >= 0 )//N
                  count = board[i-1][j] == 1 ? count+1 : count; 
                
                if(i-1 >= 0  && j+1 <col)//N-E
                  count = board[i-1][j+1] == 1 ? count+1 : count;
                
                if(j+1 < col)//E
                  count = board[i][j+1] == 1 ? count+1 : count;
                
                if(i+1 < row  && j+1 < col)//SE
                  count = board[i+1][j+1] == 1 ? count+1 : count;
                
                if(i+1 < row)//S
                  count = board[i+1][j] == 1 ? count+1 : count;
                
                if(i+1 < row && j-1 >= 0)//SW
                  count = board[i+1][j-1] == 1 ? count+1 : count;
                
                if( j-1 >= 0)//W
                  count = board[i][j-1] == 1 ? count+1 : count;
                
                
                
                //copying
                if(board[i][j] == 1 && count < 2)
                    temp[i][j] = 0;
                
                else if(board[i][j] == 1 && count<=3)
                   temp[i][j] = 1;
                
                else if(board[i][j] == 1 && count >3)
                   temp[i][j] = 0;
                
                else if(board[i][j] == 0 && count == 3)
                    temp[i][j] = 1;
                    
                    
          }        
    }
        
        for(int i = 0; i < row; i++){    
            for(int j = 0; j < col; j++)
                board[i][j] = temp[i][j];
            
        }
    }
    
    
}