package ss1_java_introduction.bai_tap;
import java.util.Scanner;
public class TienTe {
    public static void main(String[] args) {
        double rate = 23000;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập USD: ");
        double usd = scanner.nextDouble();
        double vnd = usd * rate;
        System.out.println("VNĐ = " + vnd);
    }
}
