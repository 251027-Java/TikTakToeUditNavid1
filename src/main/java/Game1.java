import java.util.*;
import java.util.concurrent.TimeUnit;

public class Game1 {

    // field 
    static Scanner scan = new Scanner(System.in);
    static char player1;
    static char player2;

    // All 8 winning triples (indices into board[0..8])
    static final int[][] WIN_LINES = {
            {0,1,2}, {3,4,5}, {6,7,8}, // rows
            {0,3,6}, {1,4,7}, {2,5,8}, // columns
            {0,4,8}, {2,4,6}           // diagonals
    };


    public static void main(String[] args){
        DecideP1andP2();
        DecideWhoGoesFirst();

        System.out.println();
        System.out.println();
        System.out.println();

        char[] board = new char[9];
        //this line fills the board array with empty spaces
        Arrays.fill(board, ' ');
        board[0]='1';
        board[1]='2'; 
        board[2]='3'; 
        board[3]='4';
        board[4]='5';
        board[5]='6';
        board[6]='7';
        board[7]='8';
        board[8]='9';
        
        DisplayTemplateBoard(board);



        // decide who wants to be X and O
        // decide who goes first
        // display the template board and tell the user to choose which position to place their mark
        // board accepts the user input and then displays the updated board with inputted mark
        // repeat cycle between player1 and player2
        // if there is already a mark in the selected position, throw error and prompt for new position
        // first player to reach a win condition exits the game and presents winner
        // if neither reaches win condition and board is filled display a TIE!
        // prompt user to restart the program
    }

    // method

    public static void DecideP1andP2(){
        player1 = 0;
        player2 = 0;
        
        System.out.println("*** Please choose which to play as: X or O ***");
        System.out.println();

        char input = scan.next().charAt(0);

        if (input == 'X') {
            player1 = 'X';
            player2 = 'O';

            System.out.println();
            System.out.println();
            System.out.println("*** LET'S START ***");
            System.out.println();
            try {TimeUnit.MILLISECONDS.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
            System.out.println("Player1 is X");
            try {TimeUnit.MILLISECONDS.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
            System.out.println("Player2 is O");

        } else if (input == 'O') {
            player1 = 'O';
            player2 = 'X';
            
            System.out.println();
            System.out.println();
            System.out.println("*** LET'S START ***");
            try {TimeUnit.MILLISECONDS.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
            System.out.println();
            System.out.println("Player1 is O");
            try {TimeUnit.MILLISECONDS.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
            System.out.println("Player2 is X");
            try {TimeUnit.MILLISECONDS.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}

        } else {
            do {
                System.out.println("Please enter either X or O!");
                input = scan.next().charAt(0);
                if (input == 'X' || input == 'O') {
                    if (input == 'X') {
                        player1 = 'X';
                        player2 = 'O';

                        System.out.println();
                        System.out.println();
                        System.out.println("*** LET'S START ***");
                        try {TimeUnit.MILLISECONDS.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
                        System.out.println();
                        System.out.println("Player1 is X");
                        try {TimeUnit.MILLISECONDS.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
                        System.out.println("Player2 is O");
                        try {TimeUnit.MILLISECONDS.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
                        
                        break;
                    } else if (input == 'O') {
                        player1 = 'O';
                        player2 = 'X';

                        System.out.println();
                        System.out.println();
                        System.out.println("*** LET'S START ***");
                        try {TimeUnit.MILLISECONDS.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
                        System.out.println();
                        System.out.println("Player1 is O");
                        try {TimeUnit.MILLISECONDS.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
                        System.out.println("Player2 is X");
                        try {TimeUnit.MILLISECONDS.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}

                        break;
                    }
                }
            }
            while (input != 'X' || input != 'O');
        }
    }

    public static void DecideWhoGoesFirst(){
        System.out.println();
        System.out.println();
        System.out.println("*** LET'S DECIDE WHO GOES FIRST ***");
        try {TimeUnit.MILLISECONDS.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
        System.out.println();
        System.out.println("Lets flip a coin!");
        try {TimeUnit.MILLISECONDS.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}

        // player1 is X
        if (player1 == 'X') {
            System.out.println(player1 + " is heads and " + player2 + " is tails");
        } else { // player1 is O
            System.out.println(player1 + " is tails and " + player2 + " is heads");
        }

        double randomNumber = Math.random() * 100;

        // Player with X goes first
        if (randomNumber <= 50) {
            System.out.print("The coin landed on ");
            try {
                TimeUnit.MILLISECONDS.sleep(500);
                TimeUnit.MILLISECONDS.sleep(500);
                System.out.print(". ");
                TimeUnit.MILLISECONDS.sleep(500);
                System.out.print(". ");
                TimeUnit.MILLISECONDS.sleep(500);
                System.out.print(". ");
                TimeUnit.MILLISECONDS.sleep(500);
                System.out.print(". ");
                TimeUnit.MILLISECONDS.sleep(500);
                System.out.print(". ");
                TimeUnit.MILLISECONDS.sleep(500);
                System.out.print(". ");
                TimeUnit.MILLISECONDS.sleep(500);
                System.out.println("heads!");
                TimeUnit.MILLISECONDS.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (player1 == 'X') {
                System.out.println(player1 + " goes first!");
            } else {
                System.out.println(player2 + " goes first!");
            }
            
        } else { // randomNumber > 50 -> Tails -> Player with O goes first
            System.out.print("The coin landed on ");
            try {
                TimeUnit.MILLISECONDS.sleep(500);
                System.out.print(". ");
                TimeUnit.MILLISECONDS.sleep(500);
                System.out.print(". ");
                TimeUnit.MILLISECONDS.sleep(500);
                System.out.print(". ");
                TimeUnit.MILLISECONDS.sleep(500);
                System.out.print(". ");
                TimeUnit.MILLISECONDS.sleep(500);
                System.out.print(". ");
                TimeUnit.MILLISECONDS.sleep(500);
                System.out.print(". ");
                TimeUnit.MILLISECONDS.sleep(500);
                System.out.println("tails!");
                TimeUnit.MILLISECONDS.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (player1 == 'O') {
                System.out.println(player1 + " goes first!");
            } else {
                System.out.println(player2 + " goes first!");
            }
        }
    }
    
    public static void DisplayTemplateBoard(char[] board) {
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);

    }


    // Checks the current board for a winner or tie
    // Returns 'X' or 'O' if someone has won, 'T' if tie, or ' ' (space) if game continues
    public static char WinCondition(char[] board) {
        // 1) Check each possible winning line
        for (int[] line : WIN_LINES) {
            int a = line[0], b = line[1], c = line[2];
            char v = board[a];
            if (v != ' ' && v == board[b] && v == board[c]) {
                return v; // Found a winner ('X' or 'O')
            }
        }

        // No winner yet → check for a full board (tie)
        boolean anySpace = false;
        for (char cell : board) {
            if (cell == ' ') { anySpace = true; break; }
        }
        if (!anySpace) return 'T'; // Tie

        //Otherwise keep playing
        return ' ';
    }



}
