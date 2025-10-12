class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        if (grid[0][0] == 1 || grid[m - 1][n - 1] == 1) return 0;

        int[][] dp = new int[m][n];
        dp[0][0] = 1;

        // Fill first row and column
        for (int i = 1; i < m; i++) dp[i][0] = grid[i][0] == 1 ? 0 : dp[i - 1][0];
        for (int j = 1; j < n; j++) dp[0][j] = grid[0][j] == 1 ? 0 : dp[0][j - 1];

        // Fill rest of grid
        for (int i = 1; i < m; i++)
            for (int j = 1; j < n; j++)
                dp[i][j] = grid[i][j] == 1 ? 0 : dp[i - 1][j] + dp[i][j - 1];

        return dp[m - 1][n - 1];
    }
}

