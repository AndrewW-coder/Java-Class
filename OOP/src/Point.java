public class Point {
    int x;
    int y;

    public Point(int initialX, int initialY) {
        x = initialX;
        y = initialY;
    }

    public void translate(int a, int b) {
        x += a;
        y += b;
    }

    public double distanceFromOrigin() {
        return Math.sqrt(x * x + y * y);
    }
}