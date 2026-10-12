
class Solution {

    public boolean isSafe(char[][] board, int row, int col) {

        // Vertical up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Upper-left diagonal
        for (int i = row - 1, j = col - 1;
             i >= 0 && j >= 0;
             i--, j--) {

            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Upper-right diagonal
        for (int i = row - 1, j = col + 1;
             i >= 0 && j < board.length;
             i--, j++) {

            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public int nQueens(char[][] board, int row) {

        // Base case
        if (row == board.length) {
            return 1;
        }

        int ways = 0;

        for (int j = 0; j < board.length; j++) {

            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                ways += nQueens(board, row + 1);

                // Backtracking
                board[row][j] = '.';
            }
        }

        return ways;
    }

    public int totalNQueens(int n) {

        char[][] board = new char[n][n];

        // Initialize board
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        return nQueens(board, 0);
    }
}