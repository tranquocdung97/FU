
package slot4;

import java.util.Scanner;

public class bt36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        // Nhap day so khong giam
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Nhap so nguyen x
        int x = scanner.nextInt();

        // Tim chi so cua phan tu dau tien co gia tri bang x
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                index = i;
                break;
            }
        }

        // In ket qua
        System.out.println(index);
    }
}
