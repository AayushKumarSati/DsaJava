import java.util.Arrays;

class Solution {
    static int[][] generateMatrix(int n) {
      int matrix[][]=new int[n][n];
      int top=0,right=n-1,bottom=n-1,left=0;
      int start=1,end=n*n;
      while(start<=end){
        //print top side
        for(int j=left; j<=right; j++){
            matrix[top][j]=start++;

        }
        top++;
        //print right side
        for(int i=top; i<=bottom; i++){
            matrix[i][right]=start++;

        }
        right--;
        //print bottom side
        for(int j=right; j>=left; j--){
            matrix[bottom][j]=start++;

        }
        bottom--;
        //print right side
        for(int i=bottom; i>=top; i--){
            matrix[i][left]=start++;

        }
        left++;
      }
      return matrix;
    }

}