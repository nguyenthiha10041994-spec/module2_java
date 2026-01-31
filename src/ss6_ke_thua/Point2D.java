package ss6_ke_thua;

public class Point2D {
    protected float x, y;

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
