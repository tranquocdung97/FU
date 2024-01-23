
package Slot1;

import java.util.Scanner;

public class bt2 {
    public static void main(String[] args) {
        int n;
        int a[] = new int[101];

        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt(); //Lenh nhap gia tri cua n tu ban phim.
        for (int i = 0; i < n; i++){
            a[i] = scanner.nextInt(); // Nhap cac phan tu trong day.
        }
        int Sum = 0;
        for (int i = 0; i < n; i++){
            Sum += a[i];
        }
        System.out.print(Sum);
    }
}
