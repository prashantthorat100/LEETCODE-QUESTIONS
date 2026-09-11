class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int s = 0;
        int e = (matrix.length)*(matrix[0].length)-1;

        while(s<=e){
            int mid = s + (e-s)/2;
            int row = mid / matrix[0].length;
            int col = mid % matrix[0].length;

            if(matrix[row][col]==target){
                return true;
                }
            else if(matrix[row][col] < target){ 
                s = mid+1; 
                }
            else if(target<matrix[row][col]){ 
                e = mid -1;
                }
            
        }
        return false;
    }
}