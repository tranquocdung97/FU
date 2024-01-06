import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int m = scanner.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = scanner.nextInt();
        }

        int[] c = mergeArrays(a, b);

        for (int value : c) {
            System.out.print(value + " ");
        }
    }

    private static int[] mergeArrays(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        int i = 0, j = 0, size = 0;

        while (i < a.length && j < b.length) {
            c[size++] = (a[i] < b[j]) ? a[i++] : b[j++];
        }

        while (i < a.length) {
            c[size++] = a[i++];
        }

        while (j < b.length) {
            c[size++] = b[j++];
        }

        return c;
    }
}
