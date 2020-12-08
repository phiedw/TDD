public class Point {
    double x;
    double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point b) {
        return Math.abs(b.y - y) + Math.abs(b.x - x);
    }
}
