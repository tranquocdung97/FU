package Slot8;

import java.util.Scanner;

public class Bai78 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] t = new int[n];
        int[] kq = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = scanner.nextInt();

        for (int i = 0; i < n; i++)
            b[i] = 1;

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (a[i] >= a[j] && b[j] + 1 > b[i]) {
                    b[i] = b[j] + 1;
                    t[i] = j;
                }
            }
        }

        int csMax = 0;
        for (int i = 1; i < n; i++) {
            if (b[csMax] < b[i]) {
                csMax = i;
            }
        }

        int k = b[csMax];
        for (int i = k - 1; i >= 0; i--) {
            kq[i] = a[csMax];
            csMax = t[csMax];
        }

        for (int i = 0; i < k; i++)
            System.out.print(kq[i] + " ");

        scanner.close();
    }
}
