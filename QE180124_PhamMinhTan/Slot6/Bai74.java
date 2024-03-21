package Slot8;

import java.util.Scanner;

public class Bai74 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scanner.nextInt();
        int end = 0, k = 1, max = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                k++;
                if (end < i && k >= max) {
                    end = i;
                }
            } else {
                max = Math.max(max, k);
                k = 1;
            }
        }
        max = Math.max(max, k);
        for (int start = end - max + 1; start <= end; start++)
            System.out.print(arr[start] + " ");
        scanner.close();
    }
}
