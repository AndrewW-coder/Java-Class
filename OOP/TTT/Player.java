package TTT;

public class Player {
    String name;
    String symbol;

    public Player(String marker) {
        symbol = marker;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public void move() {}
}
