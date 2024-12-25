class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        boolean haszeroFirstrow = false;
        boolean haszeroFirstcol = false;
        // step1:check the first row and first col zero or not
        for (int i = 0; i < m; i++) {
            // Check first row
            if (matrix[0][i] == 0) {
                haszeroFirstrow = true;
                break;

            }
        }
        for (int i = 0; i < n; i++) {
            // Check first col
            if (matrix[i][0] == 0) {
                haszeroFirstcol = true;
                break;

            }
        }

        // // Step 2: Use first row and column to mark rows and columns to be zeroed

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;// mark row
                    matrix[0][j] = 0;// mark col

                }
            }
        }
        // step3:marks the [1,1]Zero out marked rows and columns
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;

                }
            }
        }
        // Step 4: Handle the first row and first column separately
        if (haszeroFirstrow) {
            for (int i = 0; i < m; i++) {
                matrix[0][i] = 0;
            }
        }
        if (haszeroFirstcol) {
            for (int i = 0; i < n; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}