class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        // int start=0,end=n*m-1;
        // int start = 0, end = m - 1;
        // while(start<=end){
        // int mid=start+(end-start)/2;
        // int rowindex=mid/m;
        // int colindex=mid%m;
        // if(matrix[rowindex][colindex]==target){
        // return true;
        // }
        // else if(matrix[rowindex][colindex]<target){
        // start=mid+1;
        // }
        // else{
        // end=mid-1;
        // }
        // }
        for (int i = 0; i < n; i++) {
            if (matrix[i][0] <= target && matrix[i][m - 1] >= target) {
                int start = 0, end = m - 1;

                while (start <= end) {
                    int mid = start + (end - start) / 2;
                    if (matrix[i][mid] == target) {
                        return true;
                    } else if (matrix[i][mid] < target) {
                        start = mid + 1;
                    } else {
                        end = mid - 1;
                    }
                }
            }
        }
        return false;
    }
}