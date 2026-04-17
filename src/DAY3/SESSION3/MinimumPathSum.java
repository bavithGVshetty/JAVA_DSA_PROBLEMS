package DAY3.SESSION3;

public class MinimumPathSum {
    public static int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        // Fill the rows and cols
        for (int j = 1; j < n; j++) {
            dp[0][j] = dp[j - 1][0] + grid[0][j];
        }
        for (int i = 1; i < m; i++) {
            dp[0][i] = dp[i - 1][0] + grid[0][i];
        }

        // Boot the remaining cells
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = grid[i][j] + Math.min(dp[i - 1][j], dp[i][j - 1]);

            }
        }
        return dp[m - 1][n - 1];

    }

    public static void main(String[] args) {
        int[][] Maze = {
                { 1, 3, 1 },
                { 1, 5, 1 },
                { 4, 2, 1 }
        };
        System.out.println();

    }

}
