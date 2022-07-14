package Card_Game;

import java.util.Random;

public class Player {
    private int baseHealth;
    private Card[] cardList= new Card[5];

    public Player(int health) {
        this.baseHealth = health;
        generateCards();
    }

    public void generateCards() {
        for(int i = 0; i < cardList.length; i++) {
            cardList[i] = generateCard();
        }
    }

    public void useCard(int index, Player opponent) {
        index -= 1;
        Card ourCard = cardList[index];

        int health = ourCard.getHealth();
        int damage = ourCard.getDamage();

        doDamage(damage, opponent);
        heal(health);

        cardList[index] = generateCard();

    }

    public void doDamage(int n, Player opponent) {
         opponent.baseHealth -= n;
    }

    public void heal(int n) {
        baseHealth += n;
    }

    public Card generateCard() {
        Random r = new Random();
        Card c = new Card(r.nextInt(5), r.nextInt(21));
        return c;
    }


    public int getBaseHealth() {
        return baseHealth;
    }

    public void setBaseHealth(int baseHealth) {
        this.baseHealth = baseHealth;
    }

    public void printCards() throws InterruptedException {
        for(int i = 0; i < cardList.length; i++) {
            System.out.println((i + 1) + "| Attack: " + cardList[i].getDamage()
                    + ", Health : " + cardList[i].getHealth());

            Thread.sleep(500);
        }
    }
}

