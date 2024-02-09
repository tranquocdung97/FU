package src6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int n = scanner.nextInt ();
        int[] arr = new int[1000];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt ();
        }
        int target = scanner.nextInt ();

        int result = getIndexByTarget (arr, n, target);
        System.out.println (result);
    }

    public static int getIndexByTarget(int[] arr, int n, int target) {
        int right = n - 1;
        int left = 0;
        while (left < right) {
            int middle = (right + left)/2;
            if (arr[middle] >= target) {
                right = middle;
            }
            else {
                left = middle + 1;
            }
        }
        if (arr[right] == target) {
            return right;
        }
        else {
            return -1;
        }
    }
}
