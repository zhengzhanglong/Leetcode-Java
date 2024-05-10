package _59;

public class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int count = 1;
        int is;
        int i = 0, j = 0;
        int flag = 0;//0 右 1 下 2 左 3 上
        while (true){
            is = 0;
            if (flag == 0){
                while (j < n && matrix[i][j] == 0){
                    matrix[i][j++] = count++;
                    is++;
                }
                j--;
                i++;
            }else if (flag == 1){
                while (i < n && matrix[i][j] == 0){
                    matrix[i++][j] = count++;
                    is++;
                }
                i--;
                j--;
            }else if (flag == 2){
                while (j >= 0 && matrix[i][j] == 0){
                    matrix[i][j--] = count++;
                    is++;
                }
                j++;
                i--;
            }else if (flag == 3){
                while (i >= 0 && matrix[i][j] == 0){
                    matrix[i--][j] = count++;
                    is++;
                }
                i++;
                j++;
            }
            if (is == 0) break;
            flag = (flag + 1) % 4;
        }
        return matrix;
    }
}
