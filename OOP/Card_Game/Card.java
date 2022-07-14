package Card_Game;
import java.util.Random;

public class Card {
    public Card(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }
    private int damage;
    private int health;


    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
