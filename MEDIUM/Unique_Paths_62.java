class Solution {
    int direction[][] = { { 0, 1 }, { 1, 0 } };

    public int uniquePaths(int m, int n) {
        if ( m == 1 || n == 1)
            return 1;

        int dp[][] = new int[m][n];
        for (int arr[] : dp) {
            Arrays.fill(arr, -1);
        }

        return Path(m - 1, n - 1, dp, 0, 0);
    }

    public int Path(int m, int n, int dp[][], int i, int j) {
        if (i == m && j == n)
            return 1;

        // if (dp[i][j] != -1)
        //     return dp[i][j];

        if (i >= 0 && j >= 0 && i <= m && j <= n) {

            if (dp[i][j] != -1)
                return dp[i][j];

            int sol = 0;
            for (int dir[] : direction) {
                int i1 = i + dir[0];
                int j1 = j + dir[1];
                sol += Path(m, n, dp, i1, j1);
            }
            return dp[i][j] = sol;
        } 
        return 0;
    }
    
}