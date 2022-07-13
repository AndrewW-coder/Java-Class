package src;

public class PointMain {
    public static void main(String[] args) {
        Point p1 = new Point(7, 2);


        Point p2 = new Point(3, 4);

        System.out.println("p2 is " + p2.toString());


        p1.translate(3, 4);
    }
}
