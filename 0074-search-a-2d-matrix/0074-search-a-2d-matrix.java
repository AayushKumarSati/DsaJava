class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //to row size
        int n = matrix.length;
        //to col size
        int m = matrix[0].length;
        int start = 0, end = n * m-1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int rowindex = mid / m;
            int colindex = mid % m;
            if (matrix[rowindex][colindex] == target) {
                return true;

            } else if (matrix[rowindex][colindex] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;

    }
}