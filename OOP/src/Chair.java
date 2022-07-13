package src;

public class Chair {
    private int numberOfLegs;
    private boolean isOccupied;
    private double cost;

    public Chair(int initialNumberOfLegs, boolean ifOccupied, double price) {
        setNumberOfLegs(initialNumberOfLegs);
        setIsOccupied(ifOccupied);
        setCost(price);
    }

    public boolean CanIBuy(double money) {
        if(money >= cost) {
            return true;
        }

        return false;
    }

    public void destroyChair() {
        setCost(0);
        setNumberOfLegs(0);
        setIsOccupied(false);
    }

    public void removeOccupant() {
        setIsOccupied(false);
        numberOfLegs -= 2;
    }

    public double getCost() {
        return cost;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public boolean getIsOccupied() {
        return isOccupied;
    }

    public void setNumberOfLegs(int n) {
        numberOfLegs = n;
    }

    public void setIsOccupied(boolean b) {
        isOccupied = b;
    }

    public void setCost(double d) {
        if(d < 0) {
            throw new IllegalArgumentException();
        }
        cost = d;
    }
}
