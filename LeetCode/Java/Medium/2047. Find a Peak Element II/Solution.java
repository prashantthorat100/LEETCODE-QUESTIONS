class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;

        int left = 0;
        int right = cols - 1;

        while (left <= right) {
            int midCol = left + (right - left) / 2;

            // Find maximum element in the middle column
            int maxRow = 0;

            for (int row = 1; row < rows; row++) {
                if (mat[row][midCol] > mat[maxRow][midCol]) {
                    maxRow = row;
                }
            }

            int leftValue = midCol > 0 ? mat[maxRow][midCol - 1] : -1;
            int rightValue = midCol < cols - 1 ? mat[maxRow][midCol + 1] : -1;

            // Peak found
            if (mat[maxRow][midCol] > leftValue &&
                mat[maxRow][midCol] > rightValue) {
                return new int[]{maxRow, midCol};
            }

            // Move towards the larger neighbor
            if (leftValue > mat[maxRow][midCol]) {
                right = midCol - 1;
            } else {
                left = midCol + 1;
            }
        }

        return new int[]{-1, -1};
    }
}