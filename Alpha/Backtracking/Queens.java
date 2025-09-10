public class Queens {
    public static boolean isSafe(char board[][], int row, int col){
        //vertical diagonal
        for(int i = row-1; i >= 0; i--){
            if(board[i][col] == 'Q'){
                // printBoard(board);
                return false;
            }
        }

        // left diagonal
        for(int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--){
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        //right Diagonal
        for(int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        return true;
    }
    public static boolean nQueen(char board[][], int row){
        //base case
        if(row == board.length){
            // count++;
            return true;
        }

        //colunm gap
        for(int j = 0; j < board.length; j++){
            if(isSafe(board, row, j)){
                board[row][j] = 'Q';
                if(nQueen(board, row+1)){
                    return true;
                }
                board[row][j] = '_';    //backtracking gap
            }
        }

        return false;
    }
    public static void printBoard(char board[][]){
        System.out.println("------Chess Board------");
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                System.out.print("|"+board[i][j]);
            }
            System.out.println("|");
        }
    }
    // static int count = 0;
    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];

        //initialization
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                board[i][j] = '_';
            }
        }

        if(nQueen(board, 0)){
            System.out.println("Solution is possible");
            printBoard(board);
        } else{
            System.out.println("Solution is not possible");
        }
        // System.out.print("Total ways " + n + " and solve in nQueens = " + count);
    }
}
