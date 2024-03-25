import java.util.*;

public class Main {
    static int[] x = new int[11];

    static void printArray(int[] arr, int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(arr[i]);
        }
        System.out.print(" ");
    }

    static void dequy(int h, int k, int n) {
        for (int i = x[h - 1] + 1; i <= n - (k - h); i++) {
            x[h] = i;
            if (h == k) {
                printArray(x, k);
            } else {
                dequy(h + 1, k, n);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        x[0] = 0;
        dequy(1, k, n);
    }
}
