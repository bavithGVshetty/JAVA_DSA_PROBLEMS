package DAY3.SESSION2;

public class TwoDimensiondpRobotProblem {

    public static int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        // Intilize the row and column with 1
        for (int j = 0; j < n; j++) {
            dp[0][j] = 1;
        }
        for (int i = 0; i < n; i++) {
            dp[i][0] = 1;
        }
        // Rest of the GRID

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[m - 1][n - 1];

    }

    public static void main(String[] b) {
        System.out.println(uniquePaths(3, 3));
    }
}
