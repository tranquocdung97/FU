import java.util.*;

public class Main {
    static boolean[] b;
    static int[] x;

    static void printArray(int[] a, int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(a[i]);
        }
        System.out.print(" ");
    }

    static void dequy(int k, int n) {
        for (int i = 1; i <= n; i++) {
            if (b[i]) {
                x[k] = i;
                if (k == n) {
                    printArray(x, n);
                } else {
                    b[i] = false;
                    dequy(k + 1, n);
                    b[i] = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        b = new boolean[n + 1];
        x = new int[n + 1];
        Arrays.fill(b, true);
        dequy(1, n);
    }
}
