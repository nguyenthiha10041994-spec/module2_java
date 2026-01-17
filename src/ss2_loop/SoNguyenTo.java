package ss2_loop;
public class SoNguyenTo {
    public static void main(String[] args) {
        int numbers = 20;
        int count = 0;
        int soKiemTra = 2;
        while (count < numbers) {
            boolean laSoNguyenTo = true;
            for (int i = 2; i < soKiemTra; i++) {
                if (soKiemTra % i == 0) {
                    laSoNguyenTo = false;
                    break;
                }
            }if (laSoNguyenTo) {
                System.out.print(soKiemTra + " ");
                count++;
            }
            soKiemTra++;
        }
    }
}