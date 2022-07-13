package src;

public class ChairMain {
    public static void main(String[] args) {
        Chair aaronsChair = new Chair(4, true, 69.99);
        Chair jansChair = new Chair(4, true, 42.69);

        aaronsChair.destroyChair();
        jansChair.removeOccupant();

        System.out.println(aaronsChair.getCost());
        System.out.println(aaronsChair.getIsOccupied());
        System.out.println(aaronsChair.getNumberOfLegs());

        System.out.println(jansChair.getCost());
        System.out.println(jansChair.getIsOccupied());
        System.out.println(jansChair.getNumberOfLegs());

    }
}
