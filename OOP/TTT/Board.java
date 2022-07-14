package TTT;

import java.util.Objects;

public class Board {
    private String[] board = new String[9];

    public Board() {
        for(int i = 0; i < board.length; i++) {
            board[i] = "-";
        }
    }


    public void printBoard() { //prints board
        System.out.println("   1 2 3");
        System.out.println("  -------");
        for(int i = 0; i < 3; i++) {
            if(i == 0) {
                System.out.print("A ");
            }
            else if(i == 1) {
                System.out.print("B ");
            }
            else{
                System.out.print("C ");
            }

            for(int j = 0; j < 3; j++) {
                System.out.print("|" + board[i * 3 + j]);
            }

            System.out.print("|");
            System.out.println();
            System.out.print("  ");

            for(int j = 0; j < 3; j++) {
                System.out.print("--");
            }
            System.out.print("-");
            System.out.println();

        }
    }

    public void updateBoard(String row, int col, String symbol) { //creates move
        int r = 0;

        switch(row) {
            case "A":
                r = 0;
                break;
            case "B":
                r = 1;
                break;
            case "C":
                r = 2;
                break;
            default:
                System.out.println("sdjgkagdjskg");
        }

        int index = 3 * r + col - 1;

        board[index] = symbol;
    }

    public boolean isOver(String marker) {
        String[] arr = board;
        for(int i = 0; i <= 6; i += 3) {
            if(c(arr[i], arr[i + 1]) && c(arr[i], arr[i + 2]) && c(arr[i], marker)) {
                return true;
            }
        }

        for(int i = 0; i < 3; i++) {
            if(c(arr[i], arr[i + 3]) && c(arr[i], arr[i + 6]) && c(arr[i], marker)) {
                return true;
            }
        }

        if(c(arr[0], arr[4]) && c(arr[4], arr[8]) && c(arr[0], marker)) {
            return true;
        }

        if(c(arr[2], arr[4]) && c(arr[4], arr[6])) {
            return true;
        }

        return false;
    }

    public boolean isDraw(){
        String[] arr = board;

        for(int i = 0; i < 9; i++) {
            if(arr[i].equals("-")) {
                return false;
            }
        }

        return true;
    }

    public boolean c(String a, String b) {
        if(a.equals(b)) {
            return true;
        }
        return false;
    }

    public boolean isOccupied(String row, int col) {
        int r = 0;

        switch(row) {
            case "A":
                r = 0;
                break;
            case "B":
                r = 1;
                break;
            case "C":
                r = 2;
                break;
            default:
                System.out.println("sdjgkagdjskg");
                break;
        }

        int index = 3 * r + col - 1;

        if(board[index].equals("-")) {
            return false;
        }

        return true;
    }
}
