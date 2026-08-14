class Solution {
    int yesRec(int i, int j, int[][] grid, int[][] dp) {
        if (Math.min(i, j) < 0 || i >= grid.length || j >= grid[0].length)
            return Integer.MAX_VALUE;
        
        if (i == grid.length - 1 && j == grid[0].length - 1)
            return grid[i][j];

        if (dp[i][j] != -1)
            return dp[i][j];
        
        int down = yesRec(i + 1, j, grid, dp);
        int right = yesRec(i, j + 1, grid, dp);

        return dp[i][j] = Math.min(down, right) + grid[i][j];
    }
    public int minPathSum(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            Arrays.fill(dp[i], -1);
        }

        return yesRec(0, 0, grid, dp);
    }
}