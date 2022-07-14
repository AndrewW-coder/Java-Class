package TwoZeroFourEight;
import java.util.Scanner;

public class TwoZeroFourEightMain {
    public static void main(String[] args) {
        Board b = new Board();
        Scanner console = new Scanner(System.in);
        while(true) {
            b.generateTile();
            b.reset();
            System.out.println("Score: " + b.getScore());
            b.printBoard();

            while(true) {
                System.out.println("Which direction (right, left, up, down) ?");
                String input = console.next();
                if(b.validInput(input)) {
                    switch(input) {
                        case "right":
                            for(int i = 0; i < 3; i++) {
                                b.right();
                            }
                            break;

                        case "left":
                            for(int i = 0; i < 3; i++) {
                                b.left();
                            }
                            break;

                        case "up":
                            for(int i = 0; i < 3; i++) {
                                b.up();
                            }
                            break;

                        case "down":
                            for(int i = 0; i < 3; i++) {
                                b.down();
                            }
                            break;

                        default:
                            System.out.println("askdjgkg");
                            break;
                    }
                    break;
                }
                else {
                    System.out.println("Invalid move");
                }
            }
            if(b.checkLoss()) {
                b.printBoard();
                System.out.println("You lost");
                break;
            }

            if(b.checkWin()) {
                b.printBoard();
                System.out.println("You won!");
                break;
            }
            System.out.println();
        }

    }
}


