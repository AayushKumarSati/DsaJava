class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        List<Integer> result = new ArrayList<>();
        int top = 0, bottom = row - 1, left = 0, right = col - 1;
        while (top <= bottom && left <= right) {
            // print the top most part in matrix
            for (int j = left; j <= right; j++) {
                result.add(matrix[top][j]);
            }
                top++;
            // print the right side
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
                right--;
            // print bottom side
            if (top <= bottom) {

                for (int j = right; j >= left; j--) {
                    result.add(matrix[bottom][j]);
                }
                    bottom--;
            }
            // print left side
            if (left <= right) {

                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                    left++;
            }
        }
        return result;

    }
}