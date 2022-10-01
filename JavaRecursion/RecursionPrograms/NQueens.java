public class NQueens {
    public static void main(String[] args) {
        int n=8;
        boolean[][] board = new boolean[n][n];
        int ans = queens(board,0);
        System.out.println(ans);
    }

    static int queens(boolean[][] board, int row){
        if(row == board.length){
            display(board);
            System.out.println();
            return 1;
        }

        int count = 0;
        //for checking and placing queens at all possible places
        for(int col=0;col<board.length;col++){
            //place queen if it is safe
            if(isSafe(board,row,col)){
                board[row][col] = true;
                count = count+queens(board, row+1);
                board[row][col] = false;
            }

        }
        return count;
    }

    static boolean isSafe(boolean[][] board, int row, int col){
        //check vertical 
        for(int i=0;i<row;i++){
            if(board[i][col])
            return false;
        }

        //check diagonal left
        int maxLeft = Math.min(row,col);
        for(int i=1;i<=maxLeft;i++){
            if(board[row-i][col-i])
            return false;
        }

        //check diagonal right
        int maxRight = Math.min(row, board.length-col-1);
        for(int i=1;i<=maxRight;i++){
            if(board[row-i][col+i])
            return false;
        }

        return true;
    }

    static void display(boolean[][] board){
        for(boolean[] row: board){
            for(boolean element: row){
                if(element){
                    System.out.print("Q ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
