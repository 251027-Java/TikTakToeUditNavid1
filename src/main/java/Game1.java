import java.util.*;

public class Game1 {

    public static void main(String[] args){
        char[] board = new char[9];
        //this line fills the board array with empty spaces
        Arrays.fill(board, ' ');
        board[0]='X'; board[4]='O'; board[8]='X';
        displayBoard(board);

    }

    public static void displayBoard(char[] board) {
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
    }




    public static void updateBoard(){

    }


}
