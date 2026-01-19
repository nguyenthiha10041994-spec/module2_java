package ss3_mang_trong_java;

import java.util.Scanner;

public class ChenPhanTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n + 1];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int index = sc.nextInt();
        if (index <= -1 || index > n) {
            System.out.println("Khong the chen ");
        } else {
            for (int i = n; i > index; i--) {
                array[i] = array[i - 1];
            }
            array[index] = x;
            n++;
            for (int i = 0; i < n; i++) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
