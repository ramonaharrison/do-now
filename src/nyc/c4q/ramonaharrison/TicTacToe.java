
package nyc.c4q.ramonaharrison;

/**
 * Created by Hans on 4/23/15.
 */

public class TicTacToe{

    private char[][] board;
    private char currentPlayerMark;

    public TicTacToe(){
        board = new char[3][3];
        currentPlayerMark = 'x';
        initializeBoard();
    }

    public void initializeBoard(){

        //Rows construction
        for(int i = 0; i < 3; i++){

            //Column construction
            for(int j = 0; j < 3; j++){
                board[i][j] = '-';
            }
        }
    }

    //Print the current board (GUI can be implement later)
    public void printBoard(){
        System.out.println("-------------");

        for(int i = 0; i < 3; i++){
            System.out.print("| ");
            for(int j = 0; j < 3; j++){
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    // Loop through all cells of the board and if one is found to be empty (contains char '-') then return false.
    //Otherwise the board is full
    public boolean isBoardFull(){
        boolean isFull = true;

        for(int i = 0; i < 3; i++){
            for( int j = 0; j < 3; j++){
                if(board[i][j] == '-'){
                    isFull = false;
                }
            }
        }

        return isFull;
    }

    // Returns true if there is a win, false otherwise.
    // This calls our other win check functions to check the entire board.
    public boolean checkForWin(){
        return( checkRowsForWin() || checkColumnsForWin() || checkDiagonalsForWin());
    }

    //check through ros and se if any are winners
    private boolean checkRowsForWin(){
        for(int i = 0; i < 3; i++){
            if(checkRowCol(board[i][0], board[1][i], board[i][2]) ==true){
                return true;
            }
        }
        return false;
    }

    //check through columns to see any winners
    private boolean checkColumnsForWin(){
        for(int j = 0; j < 3; j++){
            if(checkRowCol(board[0][j], board[1][j], board[2][j]) == true){
                return true;
            }
        }
        return false;
    }

    //Check the two diagonals to see if either is a win. return true if either wins
    private boolean checkDiagonalsForWin(){
        return ((checkRowCol(board[0][0], board[1][1], board[2][2]) == true) || (checkRowCol(board[0][2], board[1][1], board[2][0]) == true));
    }

    // Check to see if all three values are the same (and not empty) indicating a win.
    private boolean checkRowCol(char c1, char c2, char c3){
        return ((c1 != '-') && (c1 == c2) && (c2 == c3));
    }

    // Change player marks back and forth.
    public void changePlayer(){
        if (currentPlayerMark == 'x'){
            currentPlayerMark = 'o';
        }else{
            currentPlayerMark = 'x';
        }
    }

    // Places a mark at the cell specified by row and col with the mark of the current player.
    public boolean placeMark(int row, int col){

        //To prevent outer exception values
        if((row >= 0) && (row < 3)){
            if((col >= 0) && (col < 3)){
                if(board[row][col] == '-'){
                    board[row][col] = currentPlayerMark;
                    return true;
                }
            }
        }
        return false;
    }


}

