package ss1_java_introduction.bai_tap;
import java.util.Scanner;
public class DocSoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DocSoThanhChu doc = new DocSoThanhChu();
        int num = Integer.parseInt(scanner.nextLine());
        if (num < 0 || num > 99) {
            System.out.println("Không đọc được");
        } else if (num == 0) {
            System.out.println("Không");
        } else if (num < 10) {
            System.out.println(doc.docDonVi(num));
        } else if (num < 20) {
            System.out.println(doc.docTu10Den19(num));
        } else {
            int hangChuc = num / 10;
            int donVi = num % 10;
            String result = doc.docHangChuc(hangChuc);
            if (donVi == 0) {
                System.out.println(result);
            } else if (donVi == 1) {
                System.out.println(result + " mốt");
            } else if (donVi == 5) {
                System.out.println(result + " lăm");
            } else {
                System.out.println(result + " " + doc.docDonVi(donVi));
            }
        }
    }
    public String docDonVi(int donVi) {
        switch (donVi) {
            case 1: return "một";
            case 2: return "hai";
            case 3: return "ba";
            case 4: return "bốn";
            case 5: return "năm";
            case 6: return "sáu";
            case 7: return "bảy";
            case 8: return "tám";
            case 9: return "chín";
        }
        return "";
    }
    public String docTu10Den19(int num) {
        switch (num) {
            case 10: return "mười";
            case 11: return "mười một";
            case 12: return "mười hai";
            case 13: return "mười ba";
            case 14: return "mười bốn";
            case 15: return "mười lăm";
            case 16: return "mười sáu";
            case 17: return "mười bảy";
            case 18: return "mười tám";
            case 19: return "mười chín";
        }
        return "";
    }
    public String docHangChuc(int hangChuc) {
        switch (hangChuc) {
            case 2: return "hai mươi";
            case 3: return "ba mươi";
            case 4: return "bốn mươi";
            case 5: return "năm mươi";
            case 6: return "sáu mươi";
            case 7: return "bảy mươi";
            case 8: return "tám mươi";
            case 9: return "chín mươi";
        }
        return "";
    }
}