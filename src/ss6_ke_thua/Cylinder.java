package ss6_ke_thua;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);   // lấy radius từ Circle
        this.height = height;
    }

    public double getVolume() {
        return getArea() * height;
    }
}