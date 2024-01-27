package src2;

import java.util.Scanner;

public class LinearSearch {
    static int[] arr = new int[1000];
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int size = scanner.nextInt ();
        int value = 0;
        for (int i = 0; i < size; i++) {
            value = scanner.nextInt ();
            arr[i] = value;
        }
        int n = scanner.nextInt ();
        System.out.println (search(arr, size, n));

    }

    public static int search(int[] arr, int size, int n) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == n) {
                return i;
            }
        }
        return -1;
    }
}
