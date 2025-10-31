import java.util.*;

public class Game1 {

    // field 
    static Scanner scan = new Scanner(System.in);
    static char player1;
    static char player2;
    
    public static void main(String[] args){
        DecideP1andP2();
        DecideWhoGoesFirst();
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
            System.out.println("Player1 i X");
            System.out.println("Player2 is O");

        } else if (input == 'O') {
            player1 = 'O';
            player2 = 'X';
            
            System.out.println();
            System.out.println();
            System.out.println("*** LET'S START ***");
            System.out.println();
            System.out.println("Player1 is O");
            System.out.println("Player2 is X");

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
                        System.out.println();
                        System.out.println("Player1 i X");
                        System.out.println("Player2 is O");
                        
                        break;
                    } else if (input == 'O') {
                        player1 = 'O';
                        player2 = 'X';

                        System.out.println();
                        System.out.println();
                        System.out.println("*** LET'S START ***");
                        System.out.println();
                        System.out.println("Player1 is O");
                        System.out.println("Player2 is X");

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
        System.out.println();
        System.out.println("Lets flip a coin!");

        // player1 is X
        if (player1 == 'X') {
            System.out.println(player1 + " is heads and " + player2 + " is tails");
        } else { // player1 is O
            System.out.println(player1 + " is tails and " + player2 + " is heads");
        }

        double randomNumber = Math.random() * 100;

        // Player with X goes first
        if (randomNumber <= 50) {
            System.out.println("The coin landed on... heads!");
            if (player1 == 'X') {
                System.out.println(player1 + " goes first!");
            } else {
                System.out.println(player2 + " goes first!");
            }
            // randomNumber > 50 -> Tails -> Player with O goes first
        } else {
            System.out.println("The coin landed on... tails!");
            if (player1 == 'O') {
                System.out.println(player1 + " goes first!");
            } else {
                System.out.println(player2 + " goes first!");
            }
        }
    }
    // DisplayTemplateBoard(){}
    // DisplayUpdatedBoard(){}
    // WinCondition(){}
    // LoseCondition(){}

}
