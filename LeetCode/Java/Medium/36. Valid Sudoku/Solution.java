class Solution {
    public static boolean isSafe(char[][] sudoku, int i, int j, int num) {

        // Check row
        for (int col = 0; col < 9; col++) {
            if (col != j && sudoku[i][col] == (char)(num + '0')) {
                return false;
            }
        }

        // Check column
        for (int row = 0; row < 9; row++) {
            if (row != i && sudoku[row][j] == (char)(num + '0')) {
                return false;
            }
        }

        // Check 3x3 grid
        int startRow = (i / 3) * 3;
        int startCol = (j / 3) * 3;

        for (int x = startRow; x < startRow + 3; x++) {
            for (int y = startCol; y < startCol + 3; y++) {
                if ((x != i || y != j) &&
                    sudoku[x][y] == (char)(num + '0')) {
                    return false;
                }
            }
        }

        return true;
    }

    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                if (board[i][j] != '.') {
                    int num = board[i][j] - '0';

                    if (!isSafe(board, i, j, num)) {
                        return false;
                    }
                }
            }
        }

        return true;
    }
}