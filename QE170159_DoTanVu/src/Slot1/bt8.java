
package Slot1;

import java.util.Scanner;

public class bt8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        String result = isMonotonic(arr) ? "YES" : "NO";
        System.out.println(result);

        scanner.close();
    }

    public static boolean isMonotonic(int[] arr) {
        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                decreasing = false;
            } else if (arr[i] < arr[i - 1]) {
                increasing = false;
            }
        }

        return increasing || decreasing;
    }
}
