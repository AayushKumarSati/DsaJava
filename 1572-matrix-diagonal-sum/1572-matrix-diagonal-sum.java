class Solution {
    public int diagonalSum(int[][] mat) {
        /*
         * // use the normal approach
         * //
         * Approach 1:
         * int n = mat.length;
         * int sum = 0;
         * for (int i = 0; i < n; i++) {
         * for (int j = 0; j < n; j++) {
         * if (i == j || i + j == n - 1) {
         * sum += mat[i][j];
         * }
         * }
         * }
         * return sum;
         */

        // Approach 2;
        int sum = 0;
        int n = mat.length;
        for (int i = 0, j = 0; i < n; i++, j++) {
            sum += mat[i][j];
        }
        for (int i = 0, j = n - 1; i < n; i++, j--) {
            if (i != j)
                sum += mat[i][j];
        }
        return sum;
    }
}