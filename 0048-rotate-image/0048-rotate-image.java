class Solution {
    public void rotate(int[][] matrix) {
        //matrix=>transpose=>reverse row
        int n=matrix.length;
        // step 1: Transpose the martrix;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                //swap now matrix[i][j] from matrix[j][i]
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        // step 2: reverse the row of transpose matrix
        for(int i=0; i<n; i++){
            int start=0,end=n-1;
            while(start<end){
                //swapp now matrix[i][start] from matrix[i][end]
                int temp=matrix[i][start];
                matrix[i][start]=matrix[i][end];
                matrix[i][end]=temp;
                start++;
                end--;
            }
        }
        
    }
}