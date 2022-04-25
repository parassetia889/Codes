class Solution {
public void gameOfLife(int[][] board) {
int row = board.length, col = board[0].length;
int count = 0;
for(int i = 0; i < row; i++){
count = 0;
for(int j = 0; j < col; j++){
if(i > 0)
if(board[i-1][j] == 1)
count++;
if(board[i][j+1] == 1)
count++;
if(board[i+1][j] == 1)
count++;
if(board[i][j-1] == 1)
count++;
if(board[i-1][j-1] == 1)
count++;
if(board[i+1][j+1] == 1)
count++;
if(board[i-1][j+1] == 1)
count++;
if(board[i+1][j-1] == 1)
count++;
if(count < 2 || count > 3)
board[i][j] = 0;
else
board[i][j] = 1;
}
}
}
}