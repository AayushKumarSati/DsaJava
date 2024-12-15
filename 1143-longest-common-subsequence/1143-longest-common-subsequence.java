class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        // we have solve this problem using the dynamic programming in the DAA
        //Time Complexity : O(m*n) and Space Complexity : O(m*n)
        int m = text1.length();
        int n = text2.length();
        // initialize a matrix size of [m+1]*[n+1]
        int[][] dp = new int[m + 1][n + 1];
        // Building dp[m+1][n+1] in bottom-up fashion
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                // match the character
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;

                }
                // not matches
                else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);

                }
            }

        }
        // dp[m][n] contains length of LCS for S1[0..m-1]
        // and S2[0..n-1]
        return dp[m][n];

    }
}