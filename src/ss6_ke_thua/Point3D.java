package ss6_ke_thua;

public class Point3D extends Point2D {
    private float z;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }
    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }
}