 class Solution {
    public void rotate(int[][] matrix) {
        for(int i = 0;i<matrix.length-1;i++){
            for(int j = i+1;j<matrix.length;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i= 0; i<matrix.length;i++){
            int j2 = 0;
           for(int j = matrix[0].length-1;j>=matrix[0].length/2;j--){
             int temp = matrix[i][j];
                matrix[i][j] = matrix[i][j2];
                matrix[i][j2] = temp;
                j2++;
           }
        }
    }
}