class Solution {
    public int minDistance(String word1, String word2) {
        int dp[][] = new int[word1.length() + 1][word2.length() + 1];
        for (int arr[] : dp) {
            Arrays.fill(arr, -1);
        }
        return min(word1, word2, word1.length(), word2.length(), dp);
    }

    public int min(String word1, String word2, int i, int j, int[][] dp) {
        if (i == 0)
            return j;
        if (j == 0)
            return i;

        if (dp[i][j] != -1)
            return dp[i][j];

        if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
            return dp[i][j] = min(word1, word2, i - 1, j - 1, dp);
        } else {
            int insert = min(word1, word2, i, j - 1, dp);
            int delete = min(word1, word2, i - 1, j, dp);
            int replace = min(word1, word2, i - 1, j - 1, dp);
            return dp[i][j] = Math.min(insert, Math.min(delete, replace)) + 1;
        }

    }
}