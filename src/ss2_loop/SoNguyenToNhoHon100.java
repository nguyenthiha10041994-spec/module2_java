package ss2_loop;
public class SoNguyenToNhoHon100 {
    public static void main(String[] args) {
        System.out.println("Các số nguyên tố nhỏ hơn 100 là:");
        for (int so = 2; so < 100; so++) {
            boolean laSoNguyenTo = true;
            for (int i = 2; i < so; i++) {
                if (so % i == 0) {
                    laSoNguyenTo = false;
                    break;
                }
            }if (laSoNguyenTo) {
                System.out.print(so + " ");
            }
        }
    }
}
