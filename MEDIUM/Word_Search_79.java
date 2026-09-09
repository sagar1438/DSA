class Solution {

    int[][] direction = { { 0, 1 }, { 1, 0 }, { -1, 0 }, { 0, -1 } };

    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        char[] Alpha = word.toCharArray();
        boolean[][] check = new boolean[m][n];
        int indx = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == word.charAt(0)) {
                    if (include(board, Alpha, check, i, j, indx)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean include(char[][] board, char[] Alpha , boolean check[][] , int i , int j , int indx){
        if(i<0 || j<0 || i>=board.length || j>=board[0].length || board[i][j] != Alpha[indx] || check[i][j] == true){
            return false;
        }
        if(indx == Alpha.length-1){
            return true;
        }
            
            check[i][j] = true;
            for(int dir[] : direction){
                int i2 = i+dir[0];
                int j2 = j+dir[1];
                if(include(board,Alpha,check,i2,j2,indx + 1)){
                    return true;
                }
            }
            check[i][j] = false;
            return false;
    }
}