package TwoZeroFourEight;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

public class Board {
    private Tile[] tileBoard = new Tile[16];
    private int score = 0;

    public Board() {
        for(int i = 0; i < 16; i++) {
            Tile t = new Tile(0);
            tileBoard[i] = t;
        }
    }


    public void printBoard() {
        System.out.println("-----------------");
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                int numDigits = String.valueOf(tileBoard[i * 4 + j].getValue()).length();
                StringBuilder str1 = new StringBuilder();
                StringBuilder str2 = new StringBuilder();
                int l = (3 - numDigits)/2;
                int r = 3 - numDigits - l;

                for(int k = 0; k < l; k++) {
                    str1.append(" ");
                }

                for(int k = 0; k < r; k++) {
                    str2.append(" ");
                }

                System.out.print("|" + str1 + tileBoard[i * 4 + j].getValue() + str2);
            }
            System.out.println("|");
            System.out.println("-----------------");
        }
    }

    public void generateTile() {
        int index = findEmptySquare();

        tileBoard[index].createTile();

    }

    public int findEmptySquare() {
        ArrayList<Integer> indexes = new ArrayList<>();

        for(int i = 0; i < tileBoard.length; i++) {
            if(tileBoard[i].getValue() == 0) {
                indexes.add(i);
            }
        }

        Random r = new Random();

        int index = r.nextInt(0, indexes.size());
        return indexes.get(index);
    }

    //merging

    public void merge(Tile t1, Tile t2) {
        if(mergable(t1, t2)) {
            t1.setValue(t1.getValue() * 2);
            t1.setJustMerged(true);
            t2.setValue(0);
            score += t1.getValue();
        }

        if(swappable(t1, t2)) {
            t1.setValue(t2.getValue());
            t2.setValue(0);
        }
    }


    //movements

    public void up() {
        for(int i = 4; i < 16; i++) {
            merge(tileBoard[i - 4], tileBoard[i]);
        }
    }

    public void down() {
        for(int i = 11; i >= 0; i--) {
            merge(tileBoard[i + 4] , tileBoard[i]);
        }
    }

    public void right() {
        for(int i = 3; i >= 0; i--) {
            for(int j = 2; j >= 0; j--) {
                merge(tileBoard[4 * i + j + 1], tileBoard[4 * i + j]);
            }
        }
    }

    public void left() {
        for(int i = 0; i < 4; i++) {
            for(int j = 1; j < 4; j++) {
                merge(tileBoard[4 * i + j - 1], tileBoard[4 * i + j]);
            }
        }
    }

    //checking for swaps and merges

    public boolean mergable(Tile tOne, Tile tTwo) {
        int t1 = tOne.getValue();
        int t2 = tTwo.getValue();

        if(!tOne.isJustMerged() && !tTwo.isJustMerged() && t1 == t2 && t1 > 0) {
            return true;
        }

        return false;
    }

    public boolean swappable(Tile tOne, Tile tTwo) {
        int t1 = tOne.getValue();
        int t2 = tTwo.getValue();
        if(t1 == 0 && t2 > 0) {
            return true;
        }

        return false;
    }

    public boolean validInput(String input) {
        if(input.equals("right") || input.equals("left") || input.equals("up") || input.equals("down")) {
            return true;
        }
        return false;
    }

    public void reset() {
        for(int i = 0; i < tileBoard.length; i++) {
            tileBoard[i].setJustMerged(false);
        }
    }

    public int getScore() {
        return score;
    }

    public boolean checkLoss() {
        Tile[] b = tileBoard;

        for(int i = 0; i < 16; i++) {
            if(b[i].getValue() == 0) {
                return false;
            }
        }

        for(int i = 0; i < 12; i++) {
            if(i % 4 != 3) {
                if(b[i].getValue() == b[i + 1].getValue() || b[i].getValue() == b[i + 4].getValue()) {
                    return false;
                }
            }
        }

        for(int i = 15; i > 3; i--) {
            if(i % 4 != 0) {
                if(b[i].getValue() == b[i - 1].getValue() || b[i].getValue() == b[i - 4].getValue()) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean checkWin() {
        for(int i = 0; i < 16; i++) {
            if(tileBoard[i].getValue() == 2048) {
                return true;
            }
        }

        return false;
    }


}
