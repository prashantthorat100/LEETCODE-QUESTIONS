class Solution {

    public boolean check(char[][] board, String word, int i,int j,int idx){
        // base case
        if(  i<0 || i>=board.length || j<0 || j>=board[0].length || board[i][j]=='*' ){
            return false;
        }
        if(board[i][j]!=word.charAt(idx)){
            return false;
        }
        if(idx==word.length()-1){
            return true;
        }

        // Recursive Case

        char ch = board[i][j];
        board[i][j]= '*';

        boolean res= check(board,word,i+1,j,idx+1)||
                check(board,word,i-1,j,idx+1)||
                check(board,word,i,j+1,idx+1)||
                check(board,word,i,j-1,idx+1);
        
        board[i][j]=ch;
        return res;


    }
    public boolean exist(char[][] board, String word) {
        int idx =0;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){

                if(board[i][j]==word.charAt(idx)&& check(board,word,i,j,idx)){
                    return true;
                }
            }
        }
        return false;
    }
}