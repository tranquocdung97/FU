package src2;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int n = scanner.nextInt ();
        int[] arr = new int[1000];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt ();
        }

        int maxIndex = findMax (arr, n);
        int minIndex = findMin (arr, n);

        swap (maxIndex, minIndex, n, arr);
        for (int i = 0; i < n; i++) {
            System.out.print (arr[i] + " ");
        }
    }

    private static void swap(int maxIndex, int minIndex, int n, int[] arr) {
        int tempt = 0;
        int resultMax = arr[maxIndex]; //max = 5
        int resultMin = arr[minIndex]; //min = 1
        tempt = resultMin;
        arr[minIndex] = resultMax;
        arr[maxIndex] = tempt;
    }

    public static int findMin(int[] arr, int n) {
        int k = 0;
        for (int i = 1; i < n; i++) {
            if (arr[k] > arr[i]) {
                k = i;
            }
        }
        return k;
    }
    public static int findMax(int[] arr, int n) {
        int k = 0;
        for (int i = 1; i < n; i++) {
            if (arr[k] <= arr[i]) {
                k = i;
            }
        }
        return k;
    }
}
