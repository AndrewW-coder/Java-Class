public class PointMain {
    public static void main(String[] args) {
        Point p1 = new Point(7, 2);


        Point p2 = new Point(3, 4);
        p2.x = 4;
        p2.y = 3;

        System.out.println("p1 is (" + p1.x + ", " + p1.y + ")");
        System.out.println("p2 is (" + p2.x + ", " + p2.y + ")");

        p1.translate(3, 4);
    }
}
