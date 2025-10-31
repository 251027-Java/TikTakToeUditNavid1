import java.util.*;

public class Game1 {

    // fields
    static Scanner scan = new Scanner(System.in);
    static char player1; // 'X' or 'O'
    static char player2; // 'X' or 'O'

    public static void main(String[] args){
        // Start with an empty board and show it
        char[] board = new char[9];
        Arrays.fill(board, ' ');
        displayBoard(board);

        // Decide marks and who goes first
        DecideP1andP2();
        char first = DecideWhoGoesFirst();

        System.out.println();
        System.out.println("*** GAME START ***");
        System.out.println("First to move: " + first);

        // TODO: implement game loop and call updateBoard(board)
    }

    // ---------- board display ----------
    public static void displayBoard(char[] board) {
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
    }

    public static void updateBoard(){
        // TODO: place mark at a position and re-print the board
    }

    // ---------- choose marks ----------
    public static void DecideP1andP2(){
        player1 = 0;
        player2 = 0;

        System.out.println();
        System.out.println("*** Please choose which to play as: X or O ***");

        char input;
        while (true) {
            String token = scan.next();
            if (token.isEmpty()) {
                System.out.println("Please enter X or O:");
                continue;
            }
            input = Character.toUpperCase(token.charAt(0));
            if (input == 'X' || input == 'O') break;
            System.out.println("Please enter X or O:");
        }

        if (input == 'X') {
            player1 = 'X';
            player2 = 'O';
        } else {
            player1 = 'O';
            player2 = 'X';
        }

        System.out.println();
        System.out.println("*** LET'S START ***");
        System.out.println("Player1 is " + player1);
        System.out.println("Player2 is " + player2);
    }

    // ---------- coin flip; returns who goes first ----------
    public static char DecideWhoGoesFirst(){
        System.out.println();
        System.out.println("*** LET'S DECIDE WHO GOES FIRST ***");
        System.out.println("Let's flip a coin!");

        if (player1 == 'X') {
            System.out.println("Player1 (X) is HEADS, Player2 (O) is TAILS.");
        } else {
            System.out.println("Player1 (O) is TAILS, Player2 (X) is HEADS.");
        }

        boolean heads = new Random().nextBoolean();
        if (heads) {
            System.out.println("The coin landed on... HEADS!");
            System.out.println("'X' goes first!");
            return 'X';
        } else {
            System.out.println("The coin landed on... TAILS!");
            System.out.println("'O' goes first!");
            return 'O';
        }
    }

    // Future:
    // WinCondition(){}
    // LoseCondition(){}
}
