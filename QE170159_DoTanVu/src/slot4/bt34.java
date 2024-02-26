
package slot4;

import java.util.Scanner;

public class bt34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        // Nhap day so
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Nhap so nguyen x
        int x = scanner.nextInt();

        // Dem so lan xuat hien cua x trong day a
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                count++;
            }
        }

        // In so lan xuat hien cua x
        System.out.println(count);
    }
}
