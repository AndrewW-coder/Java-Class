package Card_Game;

import java.util.Random;
import java.util.Scanner;

public class CardGameMain {
    public static void main(String[] args) throws InterruptedException {
        Player currentPlayer;
        Player opposingPlayer;
        int currentNumber;
        boolean onesTurn;

        System.out.println("Welcome to the card game!");
        Thread.sleep(2000);

        Player player1 = new Player(50);
        Player player2 = new Player(50);


        Random r = new Random();
        int number = r.nextInt(2);
        System.out.println("Flipping the coin!");
        if (number == 0) {
            currentPlayer = player1;
            opposingPlayer = player2;
            currentNumber = 1;

            System.out.println("Player 1 goes first!");
            onesTurn = true;
        }

        else {
            currentPlayer = player2;
            opposingPlayer = player1;
            System.out.println("Player 2 goes first!");
            currentNumber = 2;
            onesTurn = false;
        }

        Thread.sleep(1000);


        player1.generateCards();
        player2.generateCards();

        Scanner console = new Scanner(System.in);
        while(player1.getBaseHealth() > 0 && player2.getBaseHealth() > 0) {

            System.out.println("Player 1 health: " + player1.getBaseHealth());
            Thread.sleep(1000);
            System.out.println("Player 2 health: " + player2.getBaseHealth());
            Thread.sleep(1000);


            System.out.println("----------------");
            System.out.println("Player " + currentNumber + "'s turn");
            System.out.println("----------------");
            player1.printCards();
            System.out.println("----------------");
            System.out.println("Which card do pick?");


            while (true) {
                System.out.print("Card number: ");
                int cardNum = console.nextInt();
                if (cardNum >= 1 && cardNum <= 5) {
                    currentPlayer.useCard(cardNum, opposingPlayer);
                    break;
                } else {
                    System.out.println("Please enter a number from 1-5");
                }
            }
            if(opposingPlayer.getBaseHealth() < 0) {
                System.out.println("Player " + currentNumber + " wins!");
                break;
            }

            if(onesTurn) {
                opposingPlayer = player1;
                currentPlayer= player2;
            }

            else {
                opposingPlayer = player2;
                currentPlayer = player1;
            }

            onesTurn = !(onesTurn);


            currentNumber = 3 - currentNumber;

            Thread.sleep(1000);
        }


    }
}
