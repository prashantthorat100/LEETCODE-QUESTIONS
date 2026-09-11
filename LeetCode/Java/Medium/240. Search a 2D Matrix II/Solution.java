class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int s = rows-1;
        int e = cols-1;
        int row =0,col=0;
        while(s>=0 && e>=0){
            if(matrix[row][cols-col-1]==target){
                return true;
            }
            else if(matrix[row][cols-col-1]<target){
                row++;
                s--;
            }
            else if(matrix[row][cols-col-1]>target){
                col++;
                e--;
            }
            
        }

        return false;

        
    }
}