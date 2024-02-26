
package slot4;

import java.util.Scanner;

public class bt35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        // Nhap day so
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // In phan tu le o chi so chan
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0 && arr[i] % 2 != 0) {
                System.out.print(arr[i] + " ");
                found = true;
            }
        }

        // Neu khong co phan tu thoa man, in "NULL"
        if (!found) {
            System.out.print("NULL");
        }
    }
}
