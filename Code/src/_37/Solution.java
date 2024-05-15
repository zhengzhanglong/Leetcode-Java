package _37;

public class Solution {
    public void solveSudoku(char[][] board) {
        backtrack(board);
    }

    public boolean backtrack(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    for (int k = 1; k <= 9; k++) {
                        char c = (char) (k + '0');
                        if (isValid(i,j,c,board)){
                            board[i][j] = c;
                            if (backtrack(board)){
                                return true;
                            }
                            board[i][j] = '.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    //判断填入数字是否合法
    public boolean isValid(int row, int col, char num, char[][] chessboard){
        //判断填充位置是否有数字
        if (chessboard[row][col] != '.'){
            return false;
        }
        //判断行合法
        for (int i = 0; i < 9; i++){
            if (i != col){
                if (chessboard[row][i] == num){
                    return false;
                }
            }
        }
        //判断列是否合法
        for (int i = 0; i < 9; i++){
            if (i != row){
                if (chessboard[i][col] == num){
                    return false;
                }
            }
        }
        //判断3*3宫格是否合法
        int r = row/3;
        int c = col/3;
        for (int i = 3*r; i < 3 + 3*r; i++){
            for (int j = 3*c; j < 3 + 3*c; j++){
                if (i != row && j != col){
                    if (chessboard[i][j] == num){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
