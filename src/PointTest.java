import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PointTest {
    private static final double TOLERANCE = 0.0001;
    @Test
    public void distance_between_same_point_is_zero() {
        Point a = new Point(2.0, 3.0);
        Point b = new Point(2.0, 3.0);
        assertEquals(0.0, a.distance(b), TOLERANCE);
    }
    @Test
    public void distance_same_x() {
        Point a = new Point(2.0, 2.0);
        Point b = new Point(2.0, 3.0);
        assertEquals(1.0, a.distance(b), TOLERANCE);
        assertEquals(1.0, b.distance(a), TOLERANCE);
    }
    @Test
    public void distance_same_y() {
        Point a = new Point(2.0, 2.0);
        Point b = new Point(3.0, 2.0);
        assertEquals(1.0, a.distance(b), TOLERANCE);
        assertEquals(1.0, b.distance(a), TOLERANCE);
    }
}
