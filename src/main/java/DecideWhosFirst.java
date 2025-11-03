package main.java;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class DecideWhosFirst {
    public Scanner scan = new Scanner(System.in);

    public void decideXO() {

        printWithDelay("Welcome to 32-bit cURL TIKTACTOE!", 50);
        System.out.println();
        System.out.println();
        printWithDelay("Let's decide who goes first with a coin flip!", 50);
        printWithDelay(" ", 500);
        System.out.println();
        System.out.println();
        printWithDelay("Heads or Tails?", 50);
        System.out.println();
        System.out.println();

        String sideOfCoin = scan.nextLine();
        String heads = "heads";
        String tails = "tails";

        sideOfCoin = sideOfCoin.toLowerCase();

        if (heads.equals(sideOfCoin) || tails.equals(sideOfCoin)) {
            coinFlip();
        } else {
            do {
                System.out.println();
                printWithDelay("Please enter either heads or tails", 50);
                System.out.println();
                System.out.println();
                sideOfCoin = scan.nextLine();
                if (heads.equals(sideOfCoin) || tails.equals(sideOfCoin)) {
                    coinFlip();
                    break;
                }
            } while (!(heads.equals(sideOfCoin)) || !(tails.equals(sideOfCoin)));
        }
    }

    private void coinFlip() {
        printWithDelay("Flipping coin...", 50);
        printWithDelay(" dramatically...", 300);
        System.out.println();
        System.out.println();

        double randomNumber = Math.random() * 100;

        if (randomNumber <= 50) {
            printWithDelay("The coin landed on . . .", 50);
            printWithDelay(" ", 500);
            printWithDelay("heads!", 50);
            System.out.println();
            System.out.println();
            printWithDelay("Heads will be X and starting first!", 50);
            System.out.println();
            System.out.println();
            printWithDelay("Tails will be O and starting second!", 50);
            System.out.println();
            System.out.println();
          
        } else { // randomNumber > 50 -> Tails -> Player with O goes first
            printWithDelay("The coin landed on . . .", 50);
            printWithDelay(" ", 500);
            printWithDelay("tails!", 50);
            System.out.println();
            System.out.println();
            printWithDelay("Tails will be X and starting first!", 50);
            System.out.println();
            System.out.println();
            printWithDelay("Heads will be O and starting second!", 50);
            System.out.println();
            System.out.println();
        }
    }

    private void printWithDelay(String text, int delayMs) {
        for (char c : text.toCharArray()) {
            System.out.print(c);
            try {
                TimeUnit.MILLISECONDS.sleep(delayMs);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

