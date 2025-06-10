class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int clm = matrix[0].length;
         int roww[] = new int[row];
        int clmm[] = new int[clm];
        for(int i =0 ;i<row;i++){
            for(int j =0;j<clm;j++){
                if(matrix[i][j] == 0){
                    roww[i] = 1;
                    clmm[j] = 1;
                } } }
        for(int i=0;i<row;i++){
            for(int j =0;j<clm;j++){
                if(roww[i] ==1||clmm[j]==1){
                    matrix[i][j] = 0;
                }
            }
        }
        
    }
}