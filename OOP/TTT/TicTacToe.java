package TTT;
import java.util.Scanner;
import java.util.Random;

public class TicTacToe {
    public static void main(String[] args) {
        Board b = new Board();
        Scanner console = new Scanner(System.in);
        boolean playerOnesTurn;

        Player currentPlayer;


        Player p1 = new Player("X");
        Player p2 = new Player("O");

        System.out.print("Player 1's name: ");
        String p1Name = console.next();
        p1.setName(p1Name);

        System.out.print("Player 2's name: ");
        String p2Name = console.next();
        p2.setName(p2Name);

        Random r = new Random();



        if(r.nextDouble() < 0.5) {
            currentPlayer = p1;
            playerOnesTurn = true;
        }

        else{
            currentPlayer = p2;
            playerOnesTurn = false;
        }

        System.out.println(currentPlayer.getName() + " goes first!");

        while(true) {
            b.printBoard();

            if(b.isDraw()) {
                System.out.println("Its a draw.");
                break;
            }

            System.out.println(currentPlayer.getName() + "'s turn!" + " (You are " + currentPlayer.symbol + ")");
            System.out.print("Insert the square you want to occupy (A 3): ");
            while(true) {
                System.out.print("Insert the square you want to occupy (e.g A 3): ");
                String row = console.next();

                if (!(row.equals("A") || row.equals("B") || row.equals("C"))) {
                    System.out.println("Invalid square");
                }

                else {
                    int col = console.nextInt();

                    if(col >= 1 && col <= 3) {
                        if(b.isOccupied(row, col)) {
                            System.out.println("That square is occupied");
                        }
                        else {
                            b.updateBoard(row, col, currentPlayer.symbol);
                            break;
                        }
                    }

                    else {
                        System.out.println("Invalid Square");
                    }
                }

            }
            if(b.isOver(currentPlayer.symbol)) {
                b.printBoard();
                System.out.println(currentPlayer.getName() + " wins!");
                break;
            }

            if(playerOnesTurn) {
                System.out.println("switched");
                currentPlayer = p2;
                playerOnesTurn = false;
            }
            else {
                System.out.println("switched");
                currentPlayer = p1;
                playerOnesTurn = true;
            }


        }

    }
}
