class Solution {

    public List<List<String>> solveNQueens(int n) {

        List<List<String>> result = new ArrayList<>();

        char board[][] = new char[n][n];

        // Initialize board
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                board[i][j] = '.';
            }
        }

        nQueens(board, 0, result);

        return result;
    }

    public boolean isSafe(char board[][], int row, int col){

        // Vertical up
        for(int i = row - 1; i >= 0; i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        // Upper-left diagonal
        for(int i = row - 1, j = col - 1;
            i >= 0 && j >= 0;
            i--, j--){

            if(board[i][j] == 'Q'){
                return false;
            }
        }

        // Upper-right diagonal
        for(int i = row - 1, j = col + 1;
            i >= 0 && j < board.length;
            i--, j++){

            if(board[i][j] == 'Q'){
                return false;
            }
        }

        return true;
    }

    public void nQueens(char board[][], int row,
                        List<List<String>> result){

        // Base case
        if(row == board.length){

            List<String> currentBoard = new ArrayList<>();

            for(int i = 0; i < board.length; i++){
                currentBoard.add(new String(board[i]));
            }

            result.add(currentBoard);

            return;
        }

        // Try every column
        for(int col = 0; col < board.length; col++){

            if(isSafe(board, row, col)){

                // Place queen
                board[row][col] = 'Q';

                // Move to next row
                nQueens(board, row + 1, result);

                // Backtrack
                board[row][col] = '.';
            }
        }
    }
}