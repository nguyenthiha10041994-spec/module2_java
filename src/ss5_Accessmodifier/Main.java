package ss5_Accessmodifier;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(2.5);
        System.out.println("Ban kinh: " + circle.getRadius());
        System.out.println("Mau sac: " + circle.getColor());
        System.out.println("Dien tich: " + circle.getArea());
    }
}