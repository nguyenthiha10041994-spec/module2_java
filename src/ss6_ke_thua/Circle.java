package ss6_ke_thua;

public class Circle {
    protected double radius;

    public Circle() {
        radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}