package TwoZeroFourEight;

import java.util.Random;

public class Tile {
    private int value;
    private boolean justMerged = false;

    public boolean isJustMerged() {
        return justMerged;
    }

    public void setJustMerged(boolean justMerged) {
        this.justMerged = justMerged;
    }

    public void createTile() {
        Random r = new Random();

        if(r.nextInt(1, 11) <= 9) {
            setValue(2);
        }

        else{
            setValue(4);
        }
    }

    public int getValue() {
        return value;
    }

    public void setValue(int val) {
        value = val;
    }

    public Tile(int n) {
        value = n;
    }
}
