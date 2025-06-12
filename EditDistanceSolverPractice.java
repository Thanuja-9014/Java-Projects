package balaji;
public class EditDistanceSolverPractice {
    public int minDistance(String word1, String word2) {
        int m = word1.length(), n = word2.length();
        int[][] dp = new int[m + 1][n + 1];

        // Initialize base cases
        for (int i = 0; i <= m; i++)
            dp[i][0] = i;
        for (int j = 0; j <= n; j++)
            dp[0][j] = j;

        // Fill the DP table
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = 1 + Math.min(
                        dp[i - 1][j],      // Delete
                        Math.min(
                            dp[i][j - 1],  // Insert
                            dp[i - 1][j - 1] // Replace
                        )
                    );
                }
            }
        }

        return dp[m][n];
    }

    // ✅ Main method to run the code
    public static void main(String[] args) {
        EditDistanceSolverPractice solver = new EditDistanceSolverPractice();
        
        String word1 = "horse";
        String word2 = "ros";
        
        int distance = solver.minDistance(word1, word2);
        System.out.println("Edit Distance between \"" + word1 + "\" and \"" + word2 + "\" is: " + distance);
    }
}
