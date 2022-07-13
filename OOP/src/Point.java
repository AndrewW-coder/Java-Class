package src;

public class Point {
    private int x;
    private int y;

    public Point(int initialX, int initialY) {
        setLocation(initialX, initialY);
    }

    public void translate(int a, int b) {
        setLocation(x + a, x + b);
    }

    public double distanceFromOrigin() {
        return Math.sqrt(x * x + y * y);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setLocation(int newX, int newY) {
        if (newX < 0 || newY < 0) {
            throw new IllegalArgumentException();
        }

        x = newX;
        y = newY;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public boolean equals(Object o) {
        if (!(o instanceof Point)) {
            return false;
        }

        Point other = (Point) o;
        return x == other.x && y == other.y;
    }
}